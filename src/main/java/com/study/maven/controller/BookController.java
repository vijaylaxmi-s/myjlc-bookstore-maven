package com.study.maven.controller;

import java.util.List;

import com.study.maven.entity.Book;
import com.study.maven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("MyBooksList")
public class BookController {

	@Autowired
	BookService bookService;
	
	 @GetMapping("/showBooks")
		public String showBooksList(Model model) {
		System.out.println("-------BookController--showBooksList()---------");
		List<Book> blist=bookService.getAllBooks();
		model.addAttribute("MyBooksList", blist);
		
		return "booksList";
	}
	
}
