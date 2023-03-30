package com.jsp.banking;

public class BankImple implements Bank
{
	int balance;

	BankImple(int balance )
	{
		this.balance=balance;
	}
	 @Override
	 public void deposit(int amount)
	 {
		 System.out.println("depositing Rs."+amount);
		 balance=balance+amount;
		 System.out.println("amount deposited sucessfully");
	 }
	 @Override
	 public void withdraw(int amount)
	 {
		 if(amount<=balance)
		 {
			 System.out.println("withdrwaing Rs."+amount);
			 balance=balance-amount;
			 System.out.println("amount withdrawing sucessfully");
		 }
		 else {
			try {
				 throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		 }
		
	 }
	 @Override
	 public int checkBalance()
	 {
		 return balance;
	 }
}
