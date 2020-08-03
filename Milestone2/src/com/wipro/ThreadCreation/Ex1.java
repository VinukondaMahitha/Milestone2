package com.wipro.ThreadCreation;

public class Ex1 extends Thread {
public static void main(String[] args) {
	Ex1 t=new Ex1();
	t.start();
	t.setName("Scooby");
	System.out.println(""+t.getName());
	Ex1 t1=new Ex1();
	t1.start();
	t1.setName("Shaggy");
	System.out.println(t1.getName());
}

}
