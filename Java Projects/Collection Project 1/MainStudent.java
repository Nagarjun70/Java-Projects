package com.jsp.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainStudent 
{

	public static void main(String[] args) 
	{
		Student s1=new Student(24,"arjun");
		Student s2=new Student(26,"shiva");
		Student s3=new Student(19,"abhi");
		Map<Integer,Student>map=new LinkedHashMap<Integer,Student>();

		map.put(100, s1);// Or map.put(100,new Student(24,"arjun"));
		map.put(200, s3);// Or map.put(100,new Student(26,"shiva"));
		map.put(300, s2);// Or map.put(100,new Student(19,"abhi"));
		// Coverting map into set using keySet()
		Set<Integer>keys=map.keySet();
		//creating an instance of arraylist & upcasting to list
		List<Student> l=new ArrayList<Student>();
		for(Integer key:keys)
		{
			Student std=map.get(key);//getting the values(student objects)
			l.add(std);//adding the values (student object)into arraylist
			System.out.println(std);//printing the  values(student object)
		}

	}

}
