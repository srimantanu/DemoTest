package com.test.springboot.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import com.test.springboot.model.Book;
import com.test.springboot.model.ReviewerDetails;
import com.test.springboot.repository.BookRepository;
import com.test.springboot.serviceimpl.BookServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceMockTest {

	@Mock
	BookRepository bookRepository;

	@InjectMocks
	private BookServiceImpl bookService;

	@Test
	public void testFindBookByTitle() throws Exception {

		List<Book> allBookList = new ArrayList<>();

		List<Book> book3rdList = new ArrayList<>();

		List<ReviewerDetails> reviewlist = new ArrayList<ReviewerDetails>();
		List<ReviewerDetails> reviewlist2 = new ArrayList<ReviewerDetails>();

		List<ReviewerDetails> reviewlist3 = new ArrayList<ReviewerDetails>();

		Date dateReview = new SimpleDateFormat("yyyy-MM-dd").parse("2018-02-28");

		Date bookpublishDate = new SimpleDateFormat("yyyy-MM-dd").parse("2018-02-22");

		Date bookpublishDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-01");

		ReviewerDetails reviewerDetails1 = new ReviewerDetails(1, "John", "The content is really good",
				new BigDecimal(4.00), dateReview);

		ReviewerDetails reviewerDetails2 = new ReviewerDetails(1, "Mike", "Very informative", new BigDecimal(5.00));

		ReviewerDetails reviewerDetails3 = new ReviewerDetails(2, "Johnson", "Books for advance programmer",
				new BigDecimal(4.5), dateReview);

		ReviewerDetails reviewerDetails4 = new ReviewerDetails(2, "Mike", "Nice topics", new BigDecimal(5.00));

		ReviewerDetails reviewerDetails5 = new ReviewerDetails(3, "Leonard",
				"There are some topic that has been deprecated", new BigDecimal(2.0));

		reviewlist.add(reviewerDetails1);
		reviewlist.add(reviewerDetails2);

		reviewlist2.add(reviewerDetails3);
		reviewlist2.add(reviewerDetails4);

		reviewlist3.add(reviewerDetails5);

		Book bookOne = new Book(1, "SQL book", "Parker", new BigInteger("981483029127"), bookpublishDate, reviewlist);

		Book bookTwo = new Book(2, "Java book", "Ronald", new BigInteger("857300923712"), bookpublishDate2,
				reviewlist2);

		Book bookThree = new Book(3, "Web application book", "Ron", new BigInteger("35870923712"), bookpublishDate2,
				reviewlist3);

		Book bookFour = new Book(4, "Data structure book", "Anwesha", new BigInteger("35870923719"), bookpublishDate2,
				reviewlist3);

		allBookList.add(bookOne);
		allBookList.add(bookTwo);
		allBookList.add(bookThree);
		allBookList.add(bookFour);

		book3rdList.add(bookFour);

		when(bookRepository.findByTitleContaining("book")).thenReturn(allBookList);

		List<Book> bookList = bookService.findBookByTitle("book");
		assertEquals(4, bookList.size());

		when(bookRepository.findByTitleContaining("Data structure book")).thenReturn(book3rdList);

		List<Book> book4List = bookService.findBookByTitle("Data structure book");

		assertEquals(new Integer(4), book4List.get(0).getBookId());

		assertEquals("Data structure book", book4List.get(0).getTitle());
		assertEquals("Anwesha", book4List.get(0).getAuthor());
		assertEquals(new BigInteger("35870923719"), book4List.get(0).getIsbn());

		assertEquals(1, book4List.get(0).getReviews().size());

		assertEquals("Leonard", book4List.get(0).getReviews().get(0).getReviewerName());
		assertNotEquals("Leonard1", book4List.get(0).getReviews().get(0).getReviewerName());

		assertNotNull(bookThree);

	}

}
