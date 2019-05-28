package com.test.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springboot.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	public Book findByTitle(String title);

	public Book findAllByBookId(Integer id);

	public List<Book> findByTitleContaining(String title);
}
