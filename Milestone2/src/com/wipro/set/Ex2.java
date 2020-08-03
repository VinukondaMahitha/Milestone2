package com.wipro.set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	String[] s= {"mahitha","sony","pooji","srija"};
	for(int i=0;i<s.length;i++)
	{
		hs.add(s[i]);
	}
	Iterator<String> g=hs.iterator();
	while(g.hasNext())
		System.out.println(g.next());
	
}
}
