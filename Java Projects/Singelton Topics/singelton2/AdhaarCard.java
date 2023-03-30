package com.jsp.singelton2;

public class AdhaarCard 
{
	String name="ARjun";
	int adharNo=1234;
	
	private AdhaarCard()
	{
		System.out.println("AadharCard Generated");
	}
	
	private static AdhaarCard ac;
	
	public static AdhaarCard getInstance()
	{
		if(ac==null)
		{
			ac=new AdhaarCard();
		}
		return ac; //return new AdhaarCard();
	}
	@Override
	public String toString()
	{
		return "Name: "+name+"AadharCard: "+adharNo;
	}
}
