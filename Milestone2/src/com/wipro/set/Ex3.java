package com.wipro.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex3 {
public static void main(String[] args) {
	TreeSet<String> hs=new TreeSet<String>();
	String[] s= {"mahitha","sony","pooji","srija"};
	for(int i=0;i<s.length;i++)
	{
		hs.add(s[i]);
	}
	String g="sony";
	String h="";
	Iterator i=hs.descendingIterator();
	System.out.println("Descending order");
	while(i.hasNext())
		System.out.println(i.next());
	Iterator<String> it=hs.iterator();
	System.out.println("using iterator");
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("Checking for specific string");
	System.out.println(hs.contains(g));
}
}
