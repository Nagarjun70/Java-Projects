package com.jsp.CustomSorting2;

import java.util.Comparator;

public class SortEmployeBySalary implements Comparator<Employe>
{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.salary.compareTo(o2.salary);
	}


}
