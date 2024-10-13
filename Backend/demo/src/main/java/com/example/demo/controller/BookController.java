package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.exception.EntityNotFound;
import com.example.demo.service.BookService;
import com.example.demo.utils.GlobalResponseHandler;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {
	
	
	@Autowired
	BookService bookService;
	
	@PostMapping("")
	public ResponseEntity<Object> createBook(@RequestBody Book book){
		return new GlobalResponseHandler().createReponse("Book created sucessfully", bookService.createBook(book), HttpStatus.CREATED);
	}
	
	
	@GetMapping("")
	public ResponseEntity<Object> index() throws EntityNotFound{
		return new GlobalResponseHandler().createReponse("Book fetched sucessfully", bookService.index(), HttpStatus.OK);
	}

}
