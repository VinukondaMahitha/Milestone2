package com.wipro.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3 {
	static void printAll(ArrayList s)
	{
		Iterator<String> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
public static void main(String[] args) {
	ArrayList<String> s=new ArrayList<String>();
	s.add("mahitha");
	s.add("sony");
	s.add("srija");
	s.add("pooji");
	 printAll(s);
}
}
