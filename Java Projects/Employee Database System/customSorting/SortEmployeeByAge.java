package com.jsp.customSorting;

import java.util.Comparator;

import com.jsp.EmpDBMS.Employee;

public class SortEmployeeByAge implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		Integer x=e1.getAge();//Integer x=21;->Auto-Boxing
		Integer y=e2.getAge();//Integer x=22;->Auto-Boxing

		return x.compareTo(y);//21.compareTo(22)->-1
		//return e1.getAge()-e2.getAge());
	}
}



