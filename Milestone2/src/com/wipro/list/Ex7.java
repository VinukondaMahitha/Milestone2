package com.wipro.list;

import java.util.Iterator;
import java.util.Vector;
class Employe
{
	int id;
	String name;
	double sal;
	public Employe(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString()
	{
	return "id"+id+" name:"+name+" salary:"+sal;
	}
	}
public class Ex7 {
public static void main(String[] args) {
	Vector<Employe> e=new Vector<Employe>();
	e.add(new Employe(1,"mahi",123456));
	e.add(new Employe(2,"mnbv",456123));
	Iterator<Employe> i=e.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
}
}
