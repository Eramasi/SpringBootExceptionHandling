package com.SBExceptionHand.App.service;

import org.springframework.stereotype.Service;

import com.SBExceptionHand.App.GlobalException.NoProductFoundException;
import com.SBExceptionHand.App.Model.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findProductById(Integer pid) {
		
		if(pid==101)
		{
			return  new Product("101","Laptop", 5638.00);
		}
		else
		{
			// throw Custom Exception using Throw keyword
			
			throw new NoProductFoundException("No Product Found");
			
		}
		
		
	}

}
