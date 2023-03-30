package com.jsp.CustomSorting2;

public class Employe 
{
	String name;
	Double salary;
	public Employe(String name, Double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", salary=" + salary +"LPA"+ "]";
	}
	
	
	

}
