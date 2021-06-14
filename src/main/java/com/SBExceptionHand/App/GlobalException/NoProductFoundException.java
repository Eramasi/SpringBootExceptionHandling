package com.SBExceptionHand.App.GlobalException;

public class NoProductFoundException extends RuntimeException
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8965911382073223309L;

	public NoProductFoundException(String msg)
	{
		super(msg);
	}

}
