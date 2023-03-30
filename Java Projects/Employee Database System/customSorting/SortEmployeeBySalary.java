package com.jsp.customSorting;

import java.util.Comparator;

import com.jsp.EmpDBMS.Employee;

public class SortEmployeeBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		Double x=e1.getSalary();//A
		Double y=e2.getSalary();//B
		return x.compareTo(y);//return e1.getSalary().compareTo(e2.getSalary());
	}

}

