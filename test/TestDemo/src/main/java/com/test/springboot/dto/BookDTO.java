package com.test.springboot.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.test.springboot.model.ReviewerDetails;

//import javax.persistence.Transient;


public class BookDTO implements Serializable{

	
	private static final long serialVersionUID = 1631785276399482278L;


	private String title;
	private String author;
	
	private Date publishedDate;

	private BigInteger isbn;
	private List<ReviewerDTO> reviews;
	
	
	
	//private String publishedDate1;
	
	



	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", author=" + author + ", publishedDate=" + publishedDate + ", isbn=" + isbn
				+ ", reviewerDTO=" + reviews + "]";
	}



	public BigInteger getIsbn() {
		return isbn;
	}



	public void setIsbn(BigInteger isbn) {
		this.isbn = isbn;
	}





	public List<ReviewerDTO> getReviews() {
		return reviews;
	}



	public void setReviews(List<ReviewerDTO> reviews) {
		this.reviews = reviews;
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



	public Date getPublishedDate() {
		return publishedDate;
	}



	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}



/*	public String getPublishedDate1() {
		return publishedDate1;
	}



	public void setPublishedDate1(String publishedDate1) {
		this.publishedDate1 = publishedDate1;
	}*/



	
	
	
	
	
	
	
	
	
}
