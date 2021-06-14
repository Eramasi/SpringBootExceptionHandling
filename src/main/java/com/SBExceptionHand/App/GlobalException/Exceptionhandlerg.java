package com.SBExceptionHand.App.GlobalException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptionhandlerg {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullpointerException(Model model)
	{
		model.addAttribute("errormsg", "Some Problem Occured , Please try after some time");
		
		return "Errors";
	}

	@ExceptionHandler(value=NoBookFoundException.class)
	public String handleNoBookFoundException() {
		
		return "CustomException";
		
	}
}
