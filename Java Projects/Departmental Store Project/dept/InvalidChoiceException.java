package com.jsp.dept;

public class InvalidChoiceException extends Exception
{
	private String message;
	public InvalidChoiceException(String message)
	{
		this.message=message;
	}
	public String getMessage() 
	{
		return message;
	}
	
}