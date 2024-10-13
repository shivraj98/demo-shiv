package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalResponseHandler {
	
	
	public static ResponseEntity<Object> createReponse(String message,Object payload,HttpStatus httpStatus){
		Map<String,Object> response =new HashMap<>();
		response.put("message",message);
		response.put("data",payload);
		return new ResponseEntity<Object>(response,httpStatus);
	}
	
	

	public static ResponseEntity<Object> createReponse(String message,HttpStatus httpStatus){
		Map<String,Object> response =new HashMap<>();
		response.put("message",message);
		return new ResponseEntity<Object>(response,httpStatus);
	}

}
