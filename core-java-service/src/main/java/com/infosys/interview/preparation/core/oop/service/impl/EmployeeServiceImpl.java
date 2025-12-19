package com.infosys.interview.preparation.core.oop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.interview.preparation.core.oop.dto.EmployeeDto;
import com.infosys.interview.preparation.core.oop.model.Employee;
import com.infosys.interview.preparation.core.oop.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDto employeeDto;
	
	@Override
	public List<Employee> getEmployees() {
		return employeeDto.getEmployee();
		
	}

	@Override
	public String healthCheck() {
		
		return employeeDto.healthCheck();
	}
	
	

}
