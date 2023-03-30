package com.jsp.sdbms;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

import com.jsp.CustomSorting.SortStudentByAge;
import com.jsp.CustomSorting.SortStudentById;
import com.jsp.CustomSorting.SortStudentByMarks;
import com.jsp.CustomSorting.SortStudentByName;
import com.jsp.customexception.InvalidChoiceException;
import com.jsp.customexception.StudentNotFoundException;
import java.util.*;


public class StudentManagementSystemImpl implements StudentManagementSystem 
{
	//create scanner class object to accept input
	//create LHM object and upCasting into MAP interface
	Scanner scan=new Scanner(System.in);

	Map<String,Student> db=new LinkedHashMap<String,Student>();
	@Override
	public  void addStudent()
	{
		System.out.println("Enter Student Age:");//Accept age,name,& marks
		int age=scan.nextInt();
		System.out.println("Enter Student Name");
		String name=scan.next();
		System.out.println("Enter Student Marks:");
		int marks=scan.nextInt();


		Student std=new Student(age,name,marks);//Student insatnce
		db.put(std.getId(), std);// add Student instance into DB(MAP)->put()
		System.out.println("Student Record Inserted Successfully");
		System.out.println("Student Id id"+std.getId());//print Student id

	}
	@Override
	public void displayStudent()
	{
		//Accept Student ID from the user JSP101,JSP101,JSP102
		//convert id into upperCase using toUpperCase()
		//check if the ID id present or not
		//if ID is present--> get value(student object)-->getAge(),getName(),getMarks()
		//else?
		System.out.println("Enter the Student ID");
		String id=scan.next();//String id=scan.next().toUpperCase();
		id=id.toUpperCase();

		if(db.containsKey(id))
		{
			Student std=db.get(id);//getting Student object
			System.out.println("Student details are as Follows");
			System.out.println("Student ID:"+std.getId());
			System.out.println("Student Age:"+std.getAge());
			System.out.println("Student Name:"+std.getName());
			System.out.println("Student Marks:"+std.getMarks());
		}
		else {

			try {
				String message="Student with the Id"+id+"is not Found!!";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void displayAllStudent()
	{
		if(db.size()!= 0)
		{
			System.out.println("Student Details are as Follows:");
			System.out.println("--------------------------------");
			Set<String> keys= db.keySet(); // Map into Set -> keySet()
			for(String key:keys)// for each loop to traverse keys
			{
				Student std=db.get(key);
				System.out.println(std);//or--> In single line -->System.out.println(db.get(key));// db.get(key) -> toString  -> print
			}
		}
		else
		{
			try 
			{
				String message="Student Database is Empty, Nothing to Display";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void removeStudent()
	{
		System.out.println("Enter the student id");
		String id=scan.next();// String id = scan.next().toUpperCase();
		id=id.toUpperCase();

		if(db.containsKey(id)) 
		{
			System.out.println("Student Record Found! ");
			System.out.println(db.get(id));//getting & printing student object
			db.remove(id);// removing the student object
			System.out.println("Student Record Deleted Successfully!");
		}
		else
		{
			try 
			{
				String message="Student with the Id "+ id+ "is not Found!!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void removeAllStudent()
	{
		if(db.size() != 0)
		{
			System.out.println("Available Student Records: " + db.size());
			db.clear();
			System.out.println("All the Student Records Deleted Successfully!");
		}
		else
		{
			try 
			{
				String message="Student Database is Empty, Nothing to Remove";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}  
		}

	}
	@Override
	public void updateStudent()
	{
		//Accept id and convert into upperCase
		// if id is present  --> get the value(student object)
		// display 1: update age2: update marks 3:
		// switch case 1 2 3 --> default --> ICE
		// else --> SNFE

		System.out.println("Enter the student Id:");
		String id=scan.next();// String id = scan.next().toUpperCase();
		id=id.toUpperCase();

		if(db.containsKey(id))
		{
			Student std=db.get(id);
			System.out.println("1:Update Age\n2:Update Name\3:Update Marks");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter the Age");
			int age=scan.nextInt();
			std.setAge(age);//std.setAge(scan.nextInt());
			System.out.println("Age Updated Successfully");
			break;

			case 2: System.out.println("Enter the Name");
			String name=scan.next();
			std.setName(name);
			System.out.println("Name Updated Successfully");
			break;

			case 3: System.out.println("Enter the Marks");
			int marks=scan.nextInt();
			std.setMarks(marks);
			System.out.println("Marks Updated Successfully");
			break;

			default: 
				try
				{
					throw new InvalidChoiceException("Invalid choice! ");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
		else
		{
			try 
			{
				String message="Student with the Id "+ id+ "is not Found!!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void countStudent()
	{
		System.out.println("No of Student Records: "+ db.size());

	}
	@Override
	public void sortStudent()
	{
		if(db.size()>=2)
		{
			//list & ArrayList-><student>
			//map into set->keySet()-> keys
			//traverse keys using for each loop
			//get the values(student object)& add it into ArrayList
			List<Student>list=new ArrayList<Student>();// s1 s2
			Set<String>keys=db.keySet();//JSP101 JSP102

			for(String key:keys)
			{
				list.add(db.get(key));//getting & adding student object in ArrayList
			}
			System.out.println("1:Sort Student By ID\n2:Sort Student By Age");
			System.out.println("3:Sort Student By Name\n4:Sort Student By Marks");
			System.out.println("Enter Choice");
			int choice =scan.nextInt();

			switch(choice)
			{
			case 1:
				Collections.sort(list,new SortStudentById());
				display(list);
				break;
			case 2:
				Collections.sort(list,new SortStudentByAge());
				display(list);
				break;
			case 3:
				Collections.sort(list,new SortStudentByName());
				display(list);
				break;
			case 4:
				Collections.sort(list,new SortStudentByMarks());
				display(list);
				break;
			default:
				try {
					String message="Invalid choice!!, kindly Enter the valid choice ";
					throw new InvalidChoiceException(message);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}

			}
		}
		else 
		{
			try {
				String message="No Sufficient Student Records to Sort!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void display(List<Student> list)
	{
		for(Student s:list)
		{
			System.out.println(s);
		}
	}
	@Override
	public void getStudentWithHighestMarks()
	{
		if(db.size()>=2)
		{
			List<Student>list=new ArrayList<Student>();
			Set<String>keys=db.keySet();

			for(String key:keys)
			{
				list.add(db.get(key));// getting & adding student object in AL
			}
			Collections.sort(list,new SortStudentByMarks());
			System.out.println(list.get(list.size()-1));
		}
		else {
			try {
				String message="No Sufficient Student Records to compare!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void getStudentWithLowestMarks()
	{
		if(db.size()>=2)
		{
			List<Student>list=new ArrayList<Student>();
			Set<String>keys=db.keySet();

			for(String key:keys)
			{
				list.add(db.get(key));
			}
			Collections.sort(list,new SortStudentByMarks());
			System.out.println(list.get(0));
		}else {
			try {
				String message="No Sufficient Student Records to compare!";
				throw new StudentNotFoundException(message);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
