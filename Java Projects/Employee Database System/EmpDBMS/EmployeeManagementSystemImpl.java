package com.jsp.EmpDBMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import com.jsp.CustomException.EmployeeNotFoundException;
import com.jsp.CustomException.InvalidChoiceException;
import com.jsp.EmpDBMS.Employee;
import com.jsp.customSorting.SortEmployeeByAge;
import com.jsp.customSorting.SortEmployeeById;
import com.jsp.customSorting.SortEmployeeByName;
import com.jsp.customSorting.SortEmployeeBySalary;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem
{
	Scanner scan=new Scanner(System.in);
	Map<String,Employee> db=new LinkedHashMap<String,Employee>();
	@Override
	public void AddEmployee() 
	{
		System.out.println("Enter Employee Id:");
		Integer id=scan.nextInt();
		System.out.println("Enter Employee Age:");
		int age=scan.nextInt();
		System.out.println("Enter Employee Name:");
		String name=scan.next();
		System.out.println("Enter Employee Salary:");
		double salary=scan.nextDouble();
		
		Employee emp=new Employee(id,age, name,salary);//Employee instance
		db.put(emp.getId(), emp);// Add Employee instance into DB(MAP)->put()
		System.out.println("Employee Record Inserted Successfully");
		System.out.println("Employee id"+emp.getId());//print Employee id
		
		System.out.println("*************************************************");

		
		
	}

	@Override
	public void DisplayEmployee() 
	{
		//Accept Employee ID from the user JSP101,JSP101,JSP102
				//convert id into upperCase using toUpperCase()
				//check if the ID id present or not
				//if ID is present--> get value(Employee object)-->getAge(),getName(),getSalary()
				//else?
				System.out.println("Enter the Employee ID");
				String id=scan.next();//String id=scan.next().toUpperCase();
				id=id.toUpperCase();

				if(db.containsKey(id))
				{
					Employee emp=db.get(id);//getting Employee object
					System.out.println("Employee details are as Follows");
					System.out.println("Employe ID:"+emp.getId());
					System.out.println("Employee Age:"+emp.getAge());
					System.out.println("Employee Name:"+emp.getName());
					System.out.println("Employee Salary:"+emp.getSalary());
				}
				else {

					try {
						String message="Employee with the Id"+id+"is not Found!!";
						throw new EmployeeNotFoundException(message);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
				}
		
		
	}

	@Override
	public void DisplayAllEmployee()
	{
		if(db.size()!= 0)
		{
			System.out.println("Employee Details are as Follows:");
			System.out.println("--------------------------------");
			Set<String> keys= db.keySet(); // Map into Set -> keySet()
			for(String key:keys)// for each loop to traverse keys
			{
				Employee emp=db.get(key);
				System.out.println(emp);//or--> In single line -->System.out.println(db.get(key));// db.get(key) -> toString  -> print
			}
		}
		else
		{
			try 
			{
				String message="Employee Database is Empty, Nothing to Display";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	@Override
	public void RemoveEmployee() 
	{
		System.out.println("Enter the Employee id");
		String id=scan.next();// String id = scan.next().toUpperCase();
		id=id.toUpperCase();

		if(db.containsKey(id)) 
		{
			System.out.println("Employee Record Found! ");
			System.out.println(db.get(id));//getting & printing Employeet object
			db.remove(id);// removing the Employee object
			System.out.println("Employee Record Deleted Successfully!");
		}
		else
		{
			try 
			{
				String message="Employee with the Id "+ id+ "is not Found!!";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	@Override
	public void RemoveAllEmployee() 
	{
		if(db.size() != 0)
		{
			System.out.println("Available Employee Records: " + db.size());
			db.clear();
			System.out.println("All the Employee Records Deleted Successfully!");
		}
		else
		{
			try 
			{
				String message="Employee Database is Empty, Nothing to Remove";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}  
		}
		
		
	}

	@Override
	public void UpdateEmployee() 
	{
		//Accept id and convert into upperCase
				// if id is present  --> get the value(Employee object)
				// display 1: update age2: update marks 3:
				// switch case 1 2 3 --> default --> ICE
				// else --> SNFE

				System.out.println("Enter the Employee Id:");
				String id=scan.next();// String id = scan.next().toUpperCase();
				id=id.toUpperCase();

				if(db.containsKey(id))
				{
					Employee emp=db.get(id);
					System.out.println("1:Update Age\n2:Update Name\3:Update Salary");
					System.out.println("Enter Choice");
					int choice = scan.nextInt();
					switch(choice)
					{
					case 1: System.out.println("Enter the Age");
					int age=scan.nextInt();
					emp.setAge(age);//std.setAge(scan.nextInt());
					System.out.println("Age Updated Successfully");
					break;

					case 2: System.out.println("Enter the Name");
					String name=scan.next();
					emp.setName(name);
					System.out.println("Name Updated Successfully");
					break;

					case 3: System.out.println("Enter the Salary");
					double Salary=scan.nextInt();
					emp.setSalary(Salary);
					System.out.println("Marks Updated Successfully");
					break;

					default: 
						try
						{
							throw new EmployeeNotFoundException("Invalid choice! ");
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
						String message="Employee with the Id "+ id+ "is not Found!!";
						throw new EmployeeNotFoundException(message);
					}
					catch(EmployeeNotFoundException e)
					{
						System.out.println(e.getMessage());
					}
				}

		
		
	}

	@Override
	public void CountEmployee() 
	{
		System.out.println("No of Employee Records: "+ db.size());
		
		
	}

	@Override
	public void SortEmployee()
	{
		if(db.size()>=2)
		{
			//list & ArrayList-><Employee >
			//map into set->keySet()-> keys
			//traverse keys using for each loop
			//get the values(Employee  object)& add it into ArrayList
			List<Employee >list=new ArrayList<Employee >();// s1 s2
			Set<String>keys=db.keySet();//JSP101 JSP102

			for(String key:keys)
			{
				list.add(db.get(key));//getting & adding Employee  object in ArrayList
			}
			System.out.println("1:Sort Employee By ID\n2:Sort Employee By Age");
			System.out.println("3:Sort Employee  By Name\n4:Sort Employee  By Salary");
			System.out.println("Enter Choice");
			int choice =scan.nextInt();

			switch(choice)
			{
			case 1:
				Collections.sort(list,new SortEmployeeById());
				display(list);
				break;
			case 2:
				Collections.sort(list,new SortEmployeeByAge());
				display(list);
				break;
			case 3:
				Collections.sort(list,new SortEmployeeByName());
				display(list);
				break;
			case 4:
				Collections.sort(list,new SortEmployeeBySalary());
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
				String message="No Sufficient Employee Records to Sort!";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void display(List<Employee> list)
	{
		for(Employee s:list)
		{
			System.out.println(s);
		}
	}

	@Override
	public void getEmployeeWithHighestSalary() 
	{
		if(db.size()>=2)
		{
			List<Employee>list=new ArrayList<Employee>();
			Set<String>keys=db.keySet();

			for(String key:keys)
			{
				list.add(db.get(key));// getting & adding Employee object in AL
			}
			Collections.sort(list,new SortEmployeeBySalary());
			System.out.println(list.get(list.size()-1));
		}
		else {
			try {
				String message="No Sufficient Employee Records to compare!";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	@Override
	public void getEmployeeWithLowestSalary()
	{
		if(db.size()>=2)
		{
			List<Employee>list=new ArrayList<Employee>();
			Set<String>keys=db.keySet();

			for(String key:keys)
			{
				list.add(db.get(key));
			}
			Collections.sort(list,new SortEmployeeBySalary());
			System.out.println(list.get(0));
		}else {
			try {
				String message="No Sufficient Employee Records to compare!";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
