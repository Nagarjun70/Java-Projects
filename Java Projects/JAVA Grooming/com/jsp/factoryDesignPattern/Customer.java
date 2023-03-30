package com.jsp.factoryDesignPattern;
//2. Customer--> Buy()--> 1:Flipkart 2:Amazon 3:myntra --> OnlineShoppingApp
class Buy
{
	
}
class Flipkart extends Buy
{
	
}
class Amazon extends Buy
{
	
}
class myntra extends Buy
{
	
}
public class Customer 
{
	public Buy OnlineShoppingApp(int choice)
	{
		if(choice==1)
		{
			Flipkart flipkart=new Flipkart();
			return flipkart;
		}
		else if(choice==2)
		{
			Amazon amazon=new Amazon();
			return amazon;
		}
		else if(choice==3)
		{
			myntra myntra=new myntra();
			return myntra;
		}
		else {
			return null;
		}
		
	}
	public static void main(String[] args) 
	{
		Customer customer=new Customer();
		Buy b=customer.OnlineShoppingApp(1);
		
		if(b instanceof Flipkart)
		{
			System.out.println("FLIPKART SHOPPING");
		}
		else if(b instanceof Amazon)
		{
			System.out.println("AMAZON SHOPPING");
		}
		else if(b instanceof myntra)
		{
			System.out.println("MYNTRA SHOPPING");
		}
		else {
			System.out.println("invalid choice !!");
		}

		
	}

}
