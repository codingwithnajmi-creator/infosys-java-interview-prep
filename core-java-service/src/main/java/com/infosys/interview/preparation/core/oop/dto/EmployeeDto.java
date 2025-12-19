package com.infosys.interview.preparation.core.oop.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.infosys.interview.preparation.core.oop.model.Employee;

@Component
public class EmployeeDto {
	
	
	public List<Employee> getEmployee(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Safdar", 5600000));
		employees.add(new Employee(102, "Mana", 1000000));
		employees.add(new Employee(103, "Bill", 75000));
		return employees;
	}
	
	public String healthCheck() {
		return Employee.healthCheck();
	}
}
