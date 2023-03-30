package com.jsp.lamdaexpression;

@FunctionalInterface
interface Employee
{
	void work();
}
public class Solution
{
	public static void main(String[] args) 
	{
		//Lambda Expression
		Employee emp=()->
		{
			System.out.println("working");
		};
		emp.work();

		Employee e=()->System.out.println("working");
		e.work();
	}

}