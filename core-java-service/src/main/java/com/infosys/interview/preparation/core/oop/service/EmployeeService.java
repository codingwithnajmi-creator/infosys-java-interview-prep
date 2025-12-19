package com.infosys.interview.preparation.core.oop.service;

import java.util.List;

import com.infosys.interview.preparation.core.oop.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployees();
	String healthCheck();
}
