package com.jsp.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution 
{
	public static void main(String[] args) 
	{
	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	map.put(10,"apple");
	map.put(20, "sony");
	map.put(30, "samsung");
	
	Set<Integer>keys=map.keySet();//in linkedhashmap we cannot travarse directly thats why we need to convert the map into Set
	for(int key:keys)
	{
		System.out.println(key+"--> "+map.get(key));
	}
	
	}

}
