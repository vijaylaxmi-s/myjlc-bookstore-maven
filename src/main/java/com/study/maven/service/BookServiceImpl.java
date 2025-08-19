package com.study.maven.service;

import java.util.List;

import com.study.maven.dao.BookDAO;
import com.study.maven.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> getAllBooks() {
		System.out.println("-----BookServiceImpl--getAllBooks()---------");
    	return bookDAO.findAll();
	}

	@Override
	public void addBook(Book book) {
		System.out.println("-----BookServiceImpl--addBook()---------");
		bookDAO.save(book);
	}
	
}
