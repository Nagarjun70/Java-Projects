package com.jsp.dept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImple implements DepartmentalStore
{
	//Key-->product Id->Integer & value ->Product Instance ->Product
	int TotalBill=0;
	Map<Integer,Product> db=new LinkedHashMap<Integer,Product>();
	Scanner scan=new Scanner(System.in);

	@Override
	public void AddProduct()
	{
		db.put(1,new Product("chocolate",10,5));
		db.put(2,new Product("Biscuit",20,10));
		db.put(3,new Product("IceCream",30,20));
		//when you want other product also we can add
		db.put(4, new Product("Chips", 40, 10));

	}

	@Override
	public void DisplayProduct()
	{
		Set<Integer> keys=db.keySet();
		for(int key:keys)
		{
			Product p=db.get(key);
			System.out.println("Enter "+key+" to Order: "+p.getName());
			System.out.println("Available Quantity: "+p.getQuantity());
			System.out.println("Cost: Rs."+p.getCost());
			System.out.println("-------------------------------------");
		}


	}

	@Override
	public void BuyProduct()
	{
		System.out.println("Enter Choice");//choice->key
		int choice=scan.nextInt();

		//get()return null,when the key(choice)is not present
		Product p=db.get(choice);

		if(p!=null)
		{
			//logic for buying
			System.out.println("Buying "+p.getName());

			System.out.println("Enter the Quantity: ");
			int quantity=scan.nextInt();

			if(quantity<=p.getQuantity())
			{

				//Calculating the current product cost
				int productCost=quantity *p.getCost();

				//Adding the current product cost to total Bill
				TotalBill=TotalBill + productCost;//totalBill+=productCost();

				//Updating the new Quantity
				p.setQuantity(p.getQuantity()-quantity);

				System.out.println("Ordered "+quantity+" "+p.getName());
				System.out.println("Current Product Cost is Rs."+productCost);
				System.out.println("TotalBill as of now: Rs."+TotalBill);
			}
			else {
				try {
					String message="Inavlid Quantity "+p.getName()+" not available";
					throw new InvalidQuantityException(message);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}

		}
		else {
			try {
				String message="Invalid Choice,Kindly Enter Valid Choice";
				throw new InvalidChoiceException(message);
			}
			catch(Exception e)
			{ 
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void CheckProduct()
	{
		System.out.println("The TotalBill is "+TotalBill);
		System.out.println("Thank you For Shopping!!");

	}

}