package com.test.springboot.controller;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.springboot.dto.BookDTO;
import com.test.springboot.model.Book;
import com.test.springboot.service.BookService;
import com.test.springboot.dto.ReviewerDTO;
import com.test.springboot.util.DateUtil;

@RestController
public class BookController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

	@Autowired 
	private BookService bookService;
	
	
	
	@Value("${json.file.path}")
	public String JSON_FILEPATH;
	
	
	@GetMapping("/addBookDetails")
	public @ResponseBody String addBookDetails(HttpServletRequest httpServletRequest) throws Exception {
		String result = "";
		try {
			LOGGER.info("addBookDetails:");

			ObjectMapper objectMapper;

			List<BookDTO> bookDTOList = new ArrayList<BookDTO>();

			objectMapper = new ObjectMapper();
			
		
			bookDTOList = objectMapper.readValue(new File(JSON_FILEPATH),
					new TypeReference<List<BookDTO>>() {
					});
			

			LOGGER.info("bookDTOList:" + bookDTOList.toString());

			List<Book> bookList = bookService.saveBooksList(bookDTOList);

			if (bookList != null && bookList.size() > 0) {
				result = "Data inserted successfully";
			} else {
				result = "Fail to insert Data";
			}

		} catch (Exception e) {
			// expMessage = e.getMessage();
			throw new RuntimeException(e);

		}
		return result;

	}

	@GetMapping("/booksdetails")
	public String searchBook(@RequestParam("title") String title) throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		if (title != null && !title.equalsIgnoreCase("")) {
			List<Book> bookList = bookService.findBookByTitle(title);

			if (bookList != null && bookList.size() > 0) {

				String bookDetails = objectMapper.writeValueAsString(bookList);

				return bookDetails;

			} else {
				return "Data not Found";
			}
		} else {
			return "Enter book title";
		}

	}

	@GetMapping("/booksdetailsBytitle/{title}")

	public String searchBookBytitle(@PathVariable String title) throws Exception {

		if (title != null && !title.equalsIgnoreCase("")) {
			List<Book> bookList = bookService.findBookByTitle(title);

			if (bookList != null && bookList.size() > 0) {

				ObjectMapper objectMapper = new ObjectMapper();
				return objectMapper.writeValueAsString(bookList);

			} else {
				return "Data not Found";
			}

		} else {
			return "Enter book title";
		}
	}
}
