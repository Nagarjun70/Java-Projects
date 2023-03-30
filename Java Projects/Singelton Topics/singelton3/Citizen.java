package com.jsp.singelton3;

public class Citizen 
{
	public static void main(String[] args) 
	{
		//Internally-->PrimeMinister pm=new PrimeMinister();
		
		PrimeMinister pm=PrimeMinister.getInstance();
		
		System.out.println("Name: "+pm.name);
		System.out.println("Age: "+pm.age);
		
	}

}
