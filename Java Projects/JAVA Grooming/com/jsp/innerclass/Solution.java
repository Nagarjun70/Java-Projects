package com.jsp.innerclass;
abstract class person
{
	abstract void eat();
}
class Tom extends person
{
	@Override
	void eat()
	{
		System.out.println("Tom is eating");
	}
}
public class Solution 
{
	public static void main(String[] args) 
	{
		// Explicit subclass
		Tom t=new Tom();
		t.eat();

		//anonymuos inner class
		person p=new person(){
			@Override
			void eat()
			{
				System.out.println("Person is eating");  
			}

		};
		p.eat();

	}

}
