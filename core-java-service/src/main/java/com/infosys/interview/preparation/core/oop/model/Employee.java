package com.infosys.interview.preparation.core.oop.model;

public class Employee {
	private int empId;
	private String name;
	private double salary;


	public Employee() {}


	public Employee(int empId, String name, double salary) {
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	}
	
	public static String healthCheck() {
		return "Employee Health: OK";
		
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
	return name;
	}


	public void setName(String name) {
	this.name = name;
	}


	public double getSalary() {
	return salary;
	}


	public void setSalary(double salary) {
	this.salary = salary;
	}

}
