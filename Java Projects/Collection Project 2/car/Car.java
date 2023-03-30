package com.jsp.car;

public class Car implements Comparable<Car>
{
	int cost;

	public Car(int cost) 
	{
		
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [cost:" + cost + "]";
	}

	@Override
	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		return this.cost-c.cost;
	}
}
// this-> Object to be inserted & c-> already existing object
/** Rules for comparing objects using Comparable
 * 1. class should implements comparable interface.(java.lang)
 * 2. specify Generics.
 * 3.Override comapreTo(); syntax: public int comapreTo(element e);
 **/
