package com.jsp.lamdaexpression;
@FunctionalInterface
interface Amazon
{
	void purchase(String product);

}
class Customer implements Amazon
{
	@Override
	public void purchase(String product)
	{
		System.out.println("Purchasing "+product);
	}
}
public class Test
{
	public static void main(String[] args) 
	{
		Customer c=new Customer();
		c.purchase("Laptop");

		Amazon a1=new Amazon()
		{
			@Override
			public void purchase(String product)
			{
				System.out.println("Purchasing "+product);
			}
		};
		a1.purchase("mobile phone");

		Amazon a2=(product)->
		{
			System.out.println("Purchasing "+product);
		};
		a2.purchase("Watch");

	}

}
