package com.jsp.dept;

public class InvalidQuantityException extends Exception
{
	private String message;

	public InvalidQuantityException(String message)
	{
		this.message=message;
	}

	public String getMessage() {
		return message;
	}


}