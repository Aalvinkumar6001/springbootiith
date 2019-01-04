package com.cts.iiht.iihttraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.iiht.iihttraining.model.Book;
import com.cts.iiht.iihttraining.model.Subject;
import com.cts.iiht.iihttraining.repository.BookRepository;
import com.cts.iiht.iihttraining.repository.SubjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
private BookRepository bookrepository;	
	@Autowired
	private SubjectRepository subjectrepository;

	@GetMapping("/book")
	public List<Book> getbooks(){
		List<Book> book = bookrepository.findAll();
		return book;
	}

@PostMapping("/book/create")
public void addBook( @RequestBody Book book){
	bookrepository.save(book);
}
@PostMapping("/book/subject/create")
public void addSubject( @RequestBody Subject subject){
	System.out.println(subject.toString());
	subjectrepository.save(subject);
}
@GetMapping("/book/subject")
public List<Subject> getSubjects(){
	List<Subject> subject = subjectrepository.findAll();
	return subject;
}
//
//@PutMapping("/book/update/{userId}")
//public void updateBook(@PathVariable("userId") int userId , @RequestBody  Book book ){
//	Book b = bookrepository.findByuserId(userId);
//	
//	bookrepository.save(b);
//}
//@DeleteMapping("/book/delete/{userId}")
//public void deleteBook(@PathVariable("userId") int userId){
//	Book book = bookrepository.findByuserId(userId);
//	System.out.println("book is delete");
//	bookrepository.delete(book);
//}


//	@GetMapping("/book/search/{userId}")
//	public Book getbooksbyuserId(@PathVariable("userId") int userId){
//		Book book = bookrepository.findByuserId(userId);
//		return book;
//	}
}
