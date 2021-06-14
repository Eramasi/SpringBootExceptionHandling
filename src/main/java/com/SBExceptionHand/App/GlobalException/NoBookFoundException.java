package com.SBExceptionHand.App.GlobalException;

public class NoBookFoundException extends RuntimeException 
{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 7586035159542985465L;

	public NoBookFoundException(String msg)
	{
		super(msg);
	}
	
}
