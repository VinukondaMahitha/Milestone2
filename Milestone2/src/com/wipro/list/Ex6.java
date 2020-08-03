package com.wipro.list;

import java.util.Iterator;
import java.util.Vector;

public class Ex6 {
public static void main(String[] args) {
	Vector<String> months=new Vector<String>();
	months.add("January");
	months.add("February");
	months.add("March");
	months.add("April");
	months.add("May");
	months.add("June");
	months.add("July");
	months.add("August");
	months.add("September");
	months.add("October");
	months.add("NOvember");
	months.add("December");
	Iterator<String> i=months.iterator();
	while(i.hasNext())
	System.out.println(i.next());
}
}
