package com.jsp.customSorting;

import java.util.Comparator;

import com.jsp.EmpDBMS.Employee;

public class SortEmployeeById implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		String x=e1.getId();
		String y=e2.getId();

		return x.compareTo(y);
		
	}
}
