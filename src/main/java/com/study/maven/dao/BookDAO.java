package com.study.maven.dao;

import com.study.maven.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book, Integer>{

}
