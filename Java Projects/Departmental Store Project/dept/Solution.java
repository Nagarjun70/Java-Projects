package com.jsp.dept;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Bangad Billa Store");
		System.out.println("******************************");

		Scanner scan=new Scanner(System.in);
		DepartmentalStore store=new DepartmentalStoreImple();//UpCasting due to achieve the Abstraction

		store.AddProduct();//add only once
		int choice=1;
		while(choice==1)
		{
			store.DisplayProduct();
			store.BuyProduct();
			System.out.println("Enter 1 for continue or press any number checkout");
			choice=scan.nextInt();

		}
		store.CheckProduct();


	}

}