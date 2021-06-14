package com.SBExceptionHand.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SBExceptionHand.App.Model.Product;
import com.SBExceptionHand.App.service.ProductService;

@RestController
public class ProductController {
	
@Autowired	
private ProductService productservice;

@GetMapping(value="/getproduct", produces= {"application/json"} )
public Product getProductById(@RequestParam("pid") String pid)
{
	
	Product findProductById = productservice.findProductById(Integer.parseInt(pid));
	
	return findProductById;
	
}


}
