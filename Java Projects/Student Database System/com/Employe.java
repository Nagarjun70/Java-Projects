package com.jsp.com;

public class Employe 
{
	String id;
	String name;
	static int count=101;
	
	Employe(String name)
	{
		this.id="JSP"+count;
		this.name=name;
		count++;
	}

	public static void main(String[] args) 
	{
		Employe e1=new Employe("tom");
		System.out.println("id:"+e1.id+" name:"+e1.name);
		
		Employe e2=new Employe("jerry");
		System.out.println("id:"+e2.id+" name:"+e2.name);
		

	}

}
