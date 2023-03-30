package com.jsp.customSorting;

import java.util.Comparator;

import com.jsp.EmpDBMS.Employee;

public class SortEmployeeByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		String x=e1.getName();//A
		String y=e2.getName();//B
		return x.compareTo(y);//return e1.getName().compareTo(e2.getName());
	}

}



