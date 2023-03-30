package com.jsp.DefaultSorting;

import java.util.TreeSet;

public class Solution 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(30);
		t.add(40);
		t.add(20);
		t.add(30);
		t.add(50);
		t.add(10);
		System.out.println(t);
		for(int i:t)
		{
			System.out.println(i);
		}

	}
}
/**
 * 1. when you to add an object into treeset ,internally compareTo() gets called.
 * 2.return type of comapreTo() is int, +1-> >
 *                                      -1-> <
 *                                       0-> ==
 * 3. Traversing order -> LeftNode ParentNode RightNode
 * 4. underlying DS of TreeSet is--> Binary Tree Or Binary search Tree  
 * 5. CompareTo() is present in all the wrapper classes and String class.
 * 6. when you want to add Integer Object into TreeSet,CompareTo() of Integer class
 *   gets Called,String Objects--> compareTo() of String class                                   
 */
