package com.jsp.singelton3;

public class PrimeMinister 
{
	//Rule-3
	
	private static PrimeMinister pm;//null
	
	String name="Mr.Modi";
	int age=72;
	
	//Rule-1
	
	private PrimeMinister()
	{
		System.out.println("PrimeMinister Elected");
	}
	
	//Rule-2
	
	public static PrimeMinister getInstance()
	{
		if(pm==null)
		{
			pm=new PrimeMinister();
		}
		return pm;//return new PrimeMinister();
	}

}
//Student.getInstance()-->Student s=new Student();
//Pen.getInstance()-->pen p=new pen();
