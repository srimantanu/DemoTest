package com.test.springboot.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.test.springboot.util.CustomDateSerializer;
import com.test.springboot.util.JsonDateSerializer;


@Entity
@Table(name = "t_book_details")
public class Book implements Serializable{

	
	private static final long serialVersionUID = 1631785276399482278L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "book_id")
    private Integer bookId;
	
    @Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	
	
	@Column(name = "publishedDate")
	
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date publishedDate;
	
	@Column(name = "isbn")
	private BigInteger isbn;
	
	
	 @OneToMany(cascade = CascadeType.ALL )
     @JoinColumn(name = "book_id")
	 private List<ReviewerDetails> reviews = new ArrayList<>();
	 
	 public Book() {
		 
	 }
	 
	

    public Book(Integer bookId, String title, String author, BigInteger isbn, Date bookPublishedDate,
			List<ReviewerDetails> reviewerId) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishedDate = bookPublishedDate;
		this.reviews = reviewerId;
	}



	public Integer getBookId() {
		return bookId;
	}



	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}

	
	


	public BigInteger getIsbn() {
		return isbn;
	}



	public void setIsbn(BigInteger isbn) {
		this.isbn = isbn;
	}




	public Date getPublishedDate() {
		return publishedDate;
	}



	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}



	public List<ReviewerDetails> getReviews() {
		return reviews;
	}



	public void setReviews(List<ReviewerDetails> reviews) {
		this.reviews = reviews;
	}



	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isbn=" + isbn
				+ ", publishedDate=" + publishedDate + ", reviews=" + reviews + "]";
	}



	


	
	
	
	
	
	
	
	
	
}
