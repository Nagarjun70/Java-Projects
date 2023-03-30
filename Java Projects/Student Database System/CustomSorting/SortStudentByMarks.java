package com.jsp.CustomSorting;

import java.util.Comparator;

import com.jsp.sdbms.Student;

public class SortStudentByMarks implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		
		return x.getMarks()-y.getMarks();
	}

}
