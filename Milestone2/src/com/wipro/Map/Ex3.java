package com.wipro.Map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Ex3 {
public static void main(String[] args) {
	Properties p=new Properties();
	p.setProperty("India", "Delhi");
	p.setProperty("china", "Beijing");
	p.setProperty("srilanka", "colombo");
	Set st=p.keySet();
	Iterator i=st.iterator();
	String s;
	while(i.hasNext())
	{
		s=(String) i.next();
		System.out.println(p.getProperty(s));
	}
	
}
}
