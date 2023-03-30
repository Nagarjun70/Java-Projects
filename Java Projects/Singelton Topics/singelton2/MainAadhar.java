package com.jsp.singelton2;

public class MainAadhar
{
	public static void main(String[] args) {
		//AadharCard ac=new AadhaarCard();
		AdhaarCard ac=AdhaarCard.getInstance();
		
		//when toString() is OVerridden
		System.out.println(ac);
		
		//when toString() is not Overriden
		System.out.println("Name "+ac.name);
		System.out.println("AadharNo "+ac.adharNo);
	}

}
