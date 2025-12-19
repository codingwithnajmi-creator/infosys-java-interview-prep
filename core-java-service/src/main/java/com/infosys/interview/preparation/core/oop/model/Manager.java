package com.infosys.interview.preparation.core.oop.model;

public class Manager extends Employee{
	
	private double bonus;


	public Manager(int id, String name, double salary, double bonus) {
	super(id, name, salary); // Calling Employee constructor
	this.bonus = bonus;
	}


	public double getBonus() {
	return bonus;
	}


	public void setBonus(double bonus) {
	this.bonus = bonus;
	}


	// Overriding method from Employee
	@Override
	public double getSalary() {
	return super.getSalary() + bonus;
	}


	@Override
	public String toString() {
	return "Manager [id=" + getEmpId() + ", name=" + getName() + ", salaryWithBonus=" + getSalary() + "]";
	}

}
