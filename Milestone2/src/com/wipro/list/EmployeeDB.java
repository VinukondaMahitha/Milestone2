package com.wipro.list;

import java.util.ArrayList;

public class EmployeeDB {
ArrayList list;
boolean addEmployee(Employee e)
{
	return list.add(e);
}
boolean deleteEmployee(int empid)
{
	return (boolean) list.remove(empid);
}

}
