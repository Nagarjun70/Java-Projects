package com.jsp.sdbms;

import java.util.Scanner;

import com.jsp.customexception.InvalidChoiceException;

public class Solution 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to student database project");
		System.out.println("------------------------------------");

		Scanner sc=new Scanner(System.in);
		
		
		StudentManagementSystem sms=new StudentManagementSystemImpl();
		while(true) 
		{
			System.out.println("1:Add Student\n2:Display Student\n3:Display All Students");
			System.out.println("4:Remove Student\n5:Remove All Students\n6:Update Student");
			System.out.println("7:Count Students\n8:Sort Students");
			System.out.println("9:Get Student With Highest Marks");
			System.out.println("10:Get Student With Lowest Marks");
			System.out.println("11:EXIT\nEnter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:sms.addStudent();
				break;
			case 2:sms.displayAllStudent();
				break;
			case 3:sms.displayAllStudent();
				break;
			case 4:sms.removeStudent();
				break;
			case 5:sms.removeAllStudent();
				break;
			case 6:sms.updateStudent();
				break;
			case 7:sms.countStudent();
				break;
			case 8:sms.sortStudent();
				break;
			case 9:sms.getStudentWithHighestMarks();
				break;
			case 10:sms.getStudentWithLowestMarks();
				break;
			case 11:System.out.println("Thank You!!");
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

}//end of solution

