package com.jsp.singelton1;

public class Account 
{
	private static Account obj; // obj-->null
	private Account()
	{
		System.out.println("Object is Created");
	}
	public static void createObject()
	{
		if(obj==null)
		{
			obj=new Account();
		}
		else {
			System.out.println("Object Already Craeted");
		}
	}
}
