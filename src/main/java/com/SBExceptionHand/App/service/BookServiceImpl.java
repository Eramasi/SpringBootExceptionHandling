package com.SBExceptionHand.App.service;

import org.springframework.stereotype.Service;

import com.SBExceptionHand.App.GlobalException.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findPriceById(String bookId) {
		
		if(bookId.equals("B101"))
		{
			return 500.00;
		}
		else
		{
			throw new NoBookFoundException("No Book Found with giuven Id");
		}
		
		
	}

}
