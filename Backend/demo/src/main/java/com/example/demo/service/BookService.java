package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.exception.EntityNotFound;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	
	
	@Autowired
	BookRepository  bookRepository;
	
	
	public List<Book> index() throws EntityNotFound{
		List<Book> books =bookRepository.findAll();
		if(!books.isEmpty()) {
			return books;
		}		
	throw new EntityNotFound("Books are not found");
		
	}

	
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
}
