package com.wipro.set;

import java.util.HashSet;

public class Ex1 {
	public static HashSet<String> H1=new HashSet<String>();
static HashSet<String> saveCountryNames(String CountryName)
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
