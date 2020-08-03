package com.wipro.list;

public class Employee {
int empId;
String empName,email,gender;
float salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
void GetEmployeeDetails()
{
	System.out.println("EmpId: "+empId+" Name: "+empName+" salary :"+salary);
}
}
