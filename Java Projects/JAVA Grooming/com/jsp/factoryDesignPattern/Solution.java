package com.jsp.factoryDesignPattern;
class food {

}
class Biriyani extends food
{

}
class CurdRice extends food
{

}
class FriedRice extends food
{


}
class Hotel
{
	public food OrderFood(int choice)
	{
		if(choice==1)
		{
			Biriyani b=new Biriyani();
			return b ; // return new Biriyani();
		}
		else if(choice==2)
		{
			CurdRice c=new CurdRice();
			return c; // return new CurdRice();
		}
		else if(choice==3)
		{
			FriedRice f=new FriedRice();
			return f; // return new FriedRice();
		}
		else {
			return null;
		}
	}
}
public class Solution
{
	public static void main(String[] args) 
	{
		Hotel hotel=new Hotel();
		/** Generalization or upcasting or factory design pattern
		 * ------------------------------------------------------------
		 * food obj=Hotel.OrderFood(1); -> food obj=new Biriyani();
		 * food obj=Hotel.OrderFood(1); -> food obj=new CurdRice();
		 * food obj=Hotel.OrderFood(1); -> food obj=new FriedRice();
		 * food obj=Hotel.OrderFood(1); -> food obj=null;
		 */
		food obj=hotel.OrderFood(1);

		if(obj instanceof Biriyani)
		{
			System.out.println("Eating biriyani");
		}
		else if(obj instanceof CurdRice)
		{
			System.out.println("Eating CurdRice");
		}
		else if( obj instanceof FriedRice)
		{
			System.out.println("Eating FriedRice");
		}
		else {
			System.out.println("invalid choice !!");
		}

	}

}
/** 
 * Factory Design pattern is a methods returning different types of objects, by having generalized returntype
 * 
 * Assignment:
 * 1.Mobile--> selectApp()--> 1.Uber 2:Ola 3: Rapido ---> Taxi
 * 2. Customer--> Buy()--> 1:Flipkart 2:Amazon 3:myntra --> OnlineShoppingApp
 * */
















