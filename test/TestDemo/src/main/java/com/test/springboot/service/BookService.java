package com.test.springboot.service;

import java.util.List;

import com.test.springboot.dto.BookDTO;
import com.test.springboot.model.Book;


public interface BookService {


	public List<Book> saveBooksList(List<BookDTO> bookList) throws Exception;
	public List<Book> findBookByTitle(String title) throws Exception;
	
	
	
}
