package com.jsp.CustomSorting2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainEmploye {

	public static void main(String[] args)
	{
		Employe e1= new Employe("A",4.8);
		Employe e2= new Employe("B",5.8);
		Employe e3= new Employe("C",7.5);

		Map<Integer,Employe> map=new LinkedHashMap<Integer,Employe>();
		map.put(21, e3);
		map.put(22, e2);
		map.put(23 ,e1);
		Set<Integer>keys=map.keySet();
		List<Employe>list=new ArrayList<Employe>();
		for(int key:keys)
		{
			Employe emp=map.get(key);
			list.add(emp);
			System.out.println(emp);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("1:SortEmeployeByName\n2:SortEmployeBySalary");
		System.out.println("enter choice");
		int choice=sc.nextInt();

		switch(choice)
		{
		case 1:
			Collections.sort(list,new SortEmployeByName());
			for(Employe e:list)
			{
				System.out.println(e);
			}
			break;
		case 2: 
			Collections.sort(list,new SortEmployeBySalary());
		for(Employe e:list)
		{
			System.out.println(e);
		}
		break;
		default: 
			System.out.println("invalid choice");
		}

	}

}
