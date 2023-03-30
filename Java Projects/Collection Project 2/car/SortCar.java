package com.jsp.car;

import java.util.TreeSet;

public class SortCar {

	public static void main(String[] args) 
	{
		Car c1=new Car(200);
		Car c2=new Car(300);
		Car c3=new Car(100);
		TreeSet<Car> t=new TreeSet<Car>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		for(Car i:t)
		{
			System.out.println(i);
		}
		

	}

}
