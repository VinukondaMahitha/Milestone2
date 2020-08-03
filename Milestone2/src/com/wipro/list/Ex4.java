package com.wipro.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex4 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add((int) 12.3);
	al.add(12);
	Iterator i=al.iterator();
	while(i.hasNext())
		System.out.println(i.next());
}
}
