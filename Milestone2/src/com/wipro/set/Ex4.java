package com.wipro.set;

import java.util.TreeSet;

public class Ex4 {
	public static TreeSet<String> H1=new TreeSet<String>();
static TreeSet<String> saveCountryNames(String CountryName)
{
	H1.add(CountryName);
	return H1;
}
static String getCountry(String CountryName)
{
	if(H1.contains(CountryName))
		return CountryName;
	return null;
	
}
public static void main(String[] args) {
	
System.out.println(saveCountryNames("India"));	
System.out.println(saveCountryNames("America"));
System.out.println(getCountry("India"));
}
}
