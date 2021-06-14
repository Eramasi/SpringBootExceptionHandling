package com.SBExceptionHand.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SBExceptionHand.App.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@RequestMapping(value="/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId, Model model)
	{
		Double findPriceById = bookservice.findPriceById(bookId);
		
		model.addAttribute("Price", "Book Price is ::"+findPriceById);
		
		return "display";
	}

}
