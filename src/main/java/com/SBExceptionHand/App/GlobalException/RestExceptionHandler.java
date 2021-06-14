package com.SBExceptionHand.App.GlobalException;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value=NoProductFoundException.class)
	public ResponseEntity<ApiErrors> handleNoProductException()
	{
		
		ApiErrors error=new ApiErrors(400,"No Product Found", new Date());
		
		return new ResponseEntity<ApiErrors>(error, HttpStatus.BAD_REQUEST);
	}

}
