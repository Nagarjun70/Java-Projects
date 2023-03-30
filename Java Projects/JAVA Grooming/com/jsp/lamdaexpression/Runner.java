package com.jsp.lamdaexpression;
@FunctionalInterface
interface person
{
	String display(int age);//age:20
}
public class Runner 
{
	public static void main(String[] args) {
		//1.Anonymous inner class
		person p1=new person() {

			@Override
			public String display(int age) {

				return "Age is: "+age;
			}

		};
		System.out.println(p1.display(20));

		System.out.println("------------------------");

		//2. lambda expression
		person p2=(age)->
		{
			return "Age is: "+age;
		};
		System.out.println(p2.display(22));

	}

}
