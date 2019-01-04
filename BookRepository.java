package com.cts.iiht.iihttraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.iiht.iihttraining.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	    //@Query(value = "SELECT * FROM Book WHERE user_id = ?1", nativeQuery = true)
		


}