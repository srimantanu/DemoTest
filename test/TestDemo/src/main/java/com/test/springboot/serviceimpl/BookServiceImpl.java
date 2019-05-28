package com.test.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.springboot.dto.BookDTO;
import com.test.springboot.model.Book;
import com.test.springboot.repository.BookRepository;
import com.test.springboot.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	/*Insert Book Details*/
	@Override
	public List<Book> saveBooksList(List<BookDTO> bookDtoList) throws Exception {
		

		ObjectMapper objectMapper = new ObjectMapper();
		List<Book> bookList = new ArrayList<>();

		bookList = bookDtoList.stream().map(bookDto -> {
			return objectMapper.convertValue(bookDto, new Book().getClass());

		}).collect(Collectors.toList());

		List<Book> saveBook = bookRepository.saveAll(bookList);

		return saveBook;
	}

	
	/*search Book Details by Title*/
	@Override
	public List<Book> findBookByTitle(String title) throws Exception {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByTitleContaining(title);
		return bookList;
	}

}
