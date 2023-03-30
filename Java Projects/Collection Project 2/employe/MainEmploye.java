package com.jsp.employe;

import java.util.TreeSet;

public class MainEmploye {

	public static void main(String[] args) 
	{
		employe e1=new employe("arjun",7.5);
		employe e2=new employe("shiva",6.0);
		employe e3=new employe("abhi",3.0);
		
		TreeSet<employe> t=new TreeSet<employe>();
		t.add(e2);
		t.add(e3);
		t.add(e1);
		
		for(employe i:t)
		{
			System.out.println(i);
		}
		

	}

}
