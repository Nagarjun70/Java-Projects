package com.jsp.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo 
{
	public static void main(String[] args) 
	{
		Map<String,Double>map=new LinkedHashMap<String,Double>();
		map.put("arjun", 8.8);
		map.put("shiva", 6.6);
		map.put("abhi", 7.7);

		Set<String>keys=map.keySet();
		for(String key:keys)
		{
			System.out.println("Salary of "+key +" is "+map.get(key)+"LPA");
		}
	}


}
