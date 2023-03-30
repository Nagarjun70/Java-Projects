package com.jsp.equals;
class Employee
{
	int id;
	String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Override            // Object obj=new Employee(id,name); -->upcasting
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;// downcasting
		return this.id==e.id && this.name.equals(e.name); //compasrion logic 
		
		
	}

	
}
public class MainClass 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(201,"arjun");
		Employee e2=new Employee(201,"arjun");
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.equals(new Employee(201,"arjun")));
		
		if(e1.equals(e2))
		{
			System.out.println("Id And name are same");
		}else {
			System.out.println("id and name are different");
		}
	}

}
//e1 --> this & e2 --> obj --> e
//Rules for Overriding equals():
//1. Upcasting  2. downcasting  3.comparsion logic