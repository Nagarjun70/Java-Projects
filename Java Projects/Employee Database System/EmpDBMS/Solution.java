package com.jsp.EmpDBMS;

import java.util.Scanner;

import com.jsp.CustomException.InvalidChoiceException;

public class Solution 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee database project");
		System.out.println("------------------------------------");

		Scanner sc=new Scanner(System.in);
		
		
		EmployeeManagementSystem ems=new EmployeeManagementSystemImpl();
		while(true) 
		{
			System.out.println("1:Add Employee\n2:Display Employee\n3:Display All Employee");
			System.out.println("4:Remove Employee\n5:Remove All Employee\n6:Update Employee");
			System.out.println("7:Count Students\n8:Sort Students");
			System.out.println("9:Get Employee With Highest Marks");
			System.out.println("10:Get Employee With Lowest Marks");
			System.out.println("11:EXIT");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				ems.AddEmployee();
				break;
			case 2:
				ems.DisplayEmployee();
				break;
			case 3:
				ems.DisplayAllEmployee();
				break;
			case 4:
				ems.RemoveEmployee();
				break;
			case 5:
				ems.RemoveAllEmployee();
				break;
			case 6:
				ems.UpdateEmployee();
				break;
			case 7:
				ems.CountEmployee();
				break;
			case 8:
				ems.SortEmployee();
				break;
			case 9:
				ems.getEmployeeWithHighestSalary();
				break;
			case 10:
				ems.getEmployeeWithLowestSalary();
				break;
			case 11:
				System.out.println("Thank You!!");
						System.exit(0);
				break;
				default:
					try {
						throw new InvalidChoiceException("Inavalid Choice!");
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				
			}//end of while loop
		}//end of main()
	}

}
