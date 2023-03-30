package com.jsp.CustomSorting;

import java.util.Comparator;

import com.jsp.sdbms.Student;

public class SortStudentById implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		
		return x.getId().compareTo(y.getId());
	}

}
//x-> object to inserted and y-> already existing object