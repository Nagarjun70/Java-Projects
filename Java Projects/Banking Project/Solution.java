package com.jsp.banking;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO SBI");
		System.out.println("--------------------");
		Scanner sc=new Scanner(System.in);

		Bank bank=new BankImple(1000);
		while(true)
		{
			System.out.println("1:Depsoit\n2:Withdraw\n3:CheckBalance\n4:EXIT\nEnter choice:");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to deposit:");
				int amountTODepsoit=sc.nextInt();
				bank.deposit(amountTODepsoit);// Or bank.deposit(sc.nextInt());
			
				break;
			case 2:
				System.out.println("Enter the amount to withdraw:");
				int amountToWithdraw=sc.nextInt();
				bank.withdraw(amountToWithdraw);//Or bank.withdraw(sc.nextInt());
			
				break;
			case 3:
				System.out.println("Available balance: Rs. "+bank.checkBalance());
				
				break;
			case 4:
				System.out.println("Thank You! Visit Again!");
				System.exit(0);
			default:
				System.out.println("invalid choice!");
			}
			System.out.println("--------------------------");

		}
	}

}
