package com.jsp.equals;
//1. develop a java program to check if two person objects are 
//having same age or not by overriding equals methods ?


 class person{
	 int age;
	 person(int age)
	 {
		 this.age=age;
	 }
	 @Override  // Object obj=new person(20);
	 public boolean equals(Object obj)//1. upcasting
	 {
		 person p=(person)obj;//2. downcasting
		 return this.age==p.age;//3. comparsion logic
	 }
 }
public class Solution 
{
	public static void main(String[] args) 
	{
		person p1=new person(20);
		person p2=new person(20);
		
		System.out.println(p1.equals(p2));//false
		//person.equals(new person(20))
		
		
	}

}
// p1 --> this & p2 --> obj --> p
// Rules for Overriding equals():
//1. Upcasting  2. downcasting  3.comparsion logic