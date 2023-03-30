package com.jsp.CustomSorting;

import java.util.Comparator;

public class StudentSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	// o1--> object to be inserted 
	// o2--> already existing object

}

/** Rules:
 * 1.create a new class which implements comparator interface and import from java.util package.
 * 2.specify generics
 * 3.Override compare();
 * 			syntax: public int compare(element e1,element e2);
 * 4.create an object of the sorting logic class & pass it to the constructor of treeSet.
 */
