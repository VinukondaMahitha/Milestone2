package com.wipro.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex2 {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("a","India" );
	hm.put("b", "pakistan");
	hm.put("c", "china");
	System.out.println(hm.containsKey("c"));
	System.out.println(hm.containsValue("china"));
	Set s=hm.entrySet();//key address is taken as Set for unquie value
	Iterator i=s.iterator();//Address
	while(i.hasNext())
	{
		
		Map.Entry map=(Map.Entry)i.next();//i.next() set --->map Map.Entry
		System.out.println(map.getKey()+"  "+map.getValue() );
	}
}
}
