package com.cts.iiht.iihttraining.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book {

	@Id
	@Column(name="book_id",unique=true, nullable=false)
	private long bookId;
	
	@Column(name="book_title")
	private String title;
	
	@Column(name="book_price")
	private double price;
	
	@Column(name="book_volume")
	private int volume;

	@Column(name="book_publishDate")
	private LocalDate publishDate;
	
	private int bookRefId; 

	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", volume=" + volume
				+ ", publishDate=" + publishDate + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long bookId, String title, double price, int volume, LocalDate publishDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.volume = volume;
		this.publishDate = publishDate;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	
	
}
