package com.training.pms;

import org.springframework.stereotype.Component;

@Component		// asking spring to create an object of employee		employee
public class Employee {

	String employeeName;
	public Employee() {
		System.out.println("Employee Object created");
		employeeName="Sanskar";
	}
	public Employee(String employeeName) {
		System.out.println("Employee const Object created");
		this.employeeName = employeeName;
	}

	

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDetails() {
		return "Employee get details called and the name is : "+employeeName ;
	}
}
