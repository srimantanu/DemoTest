package com.test.springboot.model;

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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.test.springboot.util.CustomDateSerializer;

@Entity
@Table(name = "t_reviewer_details")
public class ReviewerDetails implements Serializable{

	
	private static final long serialVersionUID = 1631785276399482278L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "reviewer_id")
    private Integer reviewerId;
	
    @Column(name = "reviewerName")
	private String reviewerName;
    
    @Column(name = "content")
	private String content;
	
	@Column(name = "rating")
	private BigDecimal rating;
	
	
	@Column(name = "publishedDate")
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date publishedDate;


	/* @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "book_id")
	 private Book book;*/
	 
	
	public ReviewerDetails() {
		
	}
	
   public ReviewerDetails(Integer reviewerId,String reviewerName,String content,BigDecimal rating,Date publishedDate) {
	     super();
		this.reviewerId = reviewerId;
		this.reviewerName = reviewerName;
		this.content = content;
		this.rating = rating;
		this.publishedDate = publishedDate;
		
	}
   
   public ReviewerDetails(Integer reviewerId,String reviewerName,String content,BigDecimal rating) {
	     super();
		this.reviewerId = reviewerId;
		this.reviewerName = reviewerName;
		this.content = content;
		this.rating = rating;
		
		
	}
	
	public Integer getReviewerId() {
		return reviewerId;
	}


	public void setReviewerId(Integer reviewerId) {
		this.reviewerId = reviewerId;
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

	@Override
	public String toString() {
		return "ReviewerDetails [reviewerId=" + reviewerId + ", reviewerName=" + reviewerName + ", content=" + content
				+ ", rating=" + rating + ", publishedDate=" + publishedDate + "]";
	}

/*
	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
*/

	
	
	
	
}
