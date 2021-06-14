package com.SBExceptionHand.App.Model;

public class Product {
	
	private String pid;
	private String pname;
	private Double pprice;
	
	public Product()
	{
		
	}
	
	
	public Product(String pid, String pname, Double pprice) {
		
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPprice() {
		return pprice;
	}
	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}
	
	
	
	
	

}
