package com.wipro.ThreadCreation;

public class SalesPersons extends Thread{
	public void run()
	{
		System.out.println("S1 "+"S2 "+"S3 "+"S4 "+"S5");
	}
public static void main(String[] args) {
	SalesPersons t=new SalesPersons();
	t.start();
}
}
