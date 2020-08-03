package com.wipro.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex4 {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(1,"India" );
	hm.put(2, "pakistan");
	hm.put(3, "china");
	System.out.println(hm.containsKey(2));
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
