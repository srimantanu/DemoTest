package com.test.springboot.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class ReviewerDTO implements Serializable {

	private String reviewerName;

	private String content;

	private BigDecimal rating;

	private Date publishedDate;
	
	//private String publishedDate1;

	@Override
	public String toString() {
		return "ReviewerDTO [reviewerName=" + reviewerName + ", content=" + content + ", rating=" + rating
				+ ", publishedDate=" + publishedDate + "]";
	}



	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}



	/*public String getPublishedDate1() {
		return publishedDate1;
	}



	public void setPublishedDate1(String publishedDate1) {
		this.publishedDate1 = publishedDate1;
	}*/

	
	
	/*
	 * public Book getBook() { return book; }
	 * 
	 * 
	 * public void setBook(Book book) { this.book = book; }
	 */

}
