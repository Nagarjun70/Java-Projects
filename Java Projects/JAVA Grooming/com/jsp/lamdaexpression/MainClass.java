package com.jsp.lamdaexpression;
@FunctionalInterface
interface Calculator
{
	void add(int a,int b);
	
	
}
public class MainClass 
{
	public static void main(String[] args) 
	{
		Calculator calc=(a,b)->
		{
			System.out.println("SUM: "+(a+b));
		};
		calc.add(10, 20);
		
		
		Calculator calci=(a,b)->System.out.println("SUM: "+(a+b));
		calci.add(1000,2000);
	}

}
