package com.jsp.CustomSorting;

import java.util.TreeSet;

public class Solution
{
	public static void main(String[] args) 
	{
		Student s1=new Student(24);
		Student s2=new Student(25);
		Student s3=new Student(28);
		//StudentSorting stu=new StudentSorting();
		//TreeSet<Student> t=new TreeSet<Student>(stu);
		//OR 
		TreeSet<Student> t=new TreeSet<Student>(new StudentSorting());
		t.add(s3);
		t.add(s2);
		t.add(s1);
		
		for(Student i:t)
		{
			System.out.println(i);
		}
	}

}
