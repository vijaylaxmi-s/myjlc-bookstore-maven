package com.study.maven.service;

import com.study.maven.entity.Book;

import java.util.List;

public interface BookService {
	public List<Book> getAllBooks();
	public void addBook(Book book);
}
