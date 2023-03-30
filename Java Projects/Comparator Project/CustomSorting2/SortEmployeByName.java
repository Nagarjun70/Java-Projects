package com.jsp.CustomSorting2;

import java.util.Comparator;

public class SortEmployeByName implements Comparator<Employe>
{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}