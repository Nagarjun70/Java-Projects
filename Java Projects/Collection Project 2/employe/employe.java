package com.jsp.employe;

public class employe implements Comparable<employe>
{
	String name;
	Double salary;
	public employe(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employe [name=" + name + ", salary=" + salary +" LPA]";
	}
	@Override
	public int compareTo(employe o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);//-->ascending order
		// return o.name.compareTo(this.name);-->descending order
		// return this.salary.compareTo(o.salary);-->ascending order
		//return o.salary.compareTo(this.salary);-->descending order
	}
}
// this->object to be inserted and e-> already existing object
/** taking the help of compareTo() of String class & Double class
 * to compare String Objects & Double objects respectively
 * 1.comparing order->return this.name.compareTo(o.name);
 * a.Ascending order-->return o.name.compareTo(this.name);
 * 
 * 2.comparing based on salary(double)
 * a.Ascending order->return this.salary.comapreTo(o.salary);
 * b.Descending Order->return o.salary.comapreTo(this.salary);
 */
