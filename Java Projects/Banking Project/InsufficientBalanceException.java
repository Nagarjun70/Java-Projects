package com.jsp.banking;

public class InsufficientBalanceException extends RuntimeException
{
	private String message;
	
	InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}

}
/** Documentation Comment --> Rules to develop custom exception
*------------------------------------------------------
*1.create a class with the exception name.
*2a. if class extends Exception-> Checked Exception
*2b. if class extends RuntimeException-> UNchecked Exception
*3.Override getMessage()-> (Variable,constructor,method)
*4. Invoke the exception object using throw keyword & handle it using try and catch block 
*/