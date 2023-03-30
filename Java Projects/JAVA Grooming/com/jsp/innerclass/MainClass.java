package com.jsp.innerclass;
interface Student
{
	void study();
}
public class MainClass 
{
	public static void main(String[] args)
	{
		//Anonymous Inner class with reference variable
		Student s=new Student()
		{
			@Override
			public void study()
			{
				System.out.println("studying");
			}
		};
		s.study();

		//Anonymous Inner class Without reference Variable
		new Student()   
		{
			@Override
			public void study()
			{
				System.out.println("studying");
			}
		}.study();


	}

}
