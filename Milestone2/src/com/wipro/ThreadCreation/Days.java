package com.wipro.ThreadCreation;

public class Days extends Thread {
	public void run()
	{
		String arr[]= {"sun","mon","tue","wed","thur","fri","sat"};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
public static void main(String[] args) {
	Days d=new Days();
	d.start();
}
}
