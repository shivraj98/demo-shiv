package com.example.demo.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.EntityNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	

	@ExceptionHandler({EntityNotFound.class})
	public ResponseEntity<Object> handlerEntityNotFound(Exception ex){
		return GlobalResponseHandler.createReponse(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
