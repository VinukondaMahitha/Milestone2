package com.wipro.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex5 {
static TreeMap<String,String>M1=new TreeMap<String,String>();
static TreeMap saveCountryCapital(String CountryName,String capital)
{
	M1.put(CountryName, capital);
	return M1;
}
static String getCapital(String CountryName)
{
	return M1.get(CountryName);
}
static String getCountry(String capital)
{
	return M1.get(capital);
}
static TreeMap create()
{
	TreeMap<String,String>M2=new TreeMap<String,String>();
	Set s=M1.entrySet();//key address is taken as Set for unquie value
	Iterator i=s.iterator();//Address
	while(i.hasNext())
	{
		
		Map.Entry map=(Map.Entry)i.next();//i.next() set --->map Map.Entry
		M2.put((String)map.getValue(),(String)map.getKey() );//getKey(), getValue()
	}
	return M2;
	
}
static ArrayList method5()
{
	ArrayList<String> al=new ArrayList<String>();
	Set s=M1.entrySet();//key address is taken as Set for unquie value
	Iterator i=s.iterator();//Address
	while(i.hasNext())
	{
		
		Map.Entry map=(Map.Entry)i.next();//i.next() set --->map Map.Entry
		al.add((String)map.getKey() );//getKey(), getValue()
	}
	
	Collections.sort(al);
	return al;
	
}
public static void main(String[] args) {
	System.out.println(saveCountryCapital("India","Delhi"));
	System.out.println(saveCountryCapital("Srilanka","Colombo"));
	System.out.println(saveCountryCapital("Pakistan","Istanbul"));
	System.out.println(create());
	System.out.println(method5());
}
}
