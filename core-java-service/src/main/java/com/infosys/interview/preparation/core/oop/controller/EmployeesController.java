package com.infosys.interview.preparation.core.oop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.interview.preparation.core.oop.dto.EmployeeDto;
import com.infosys.interview.preparation.core.oop.model.Employee;
import com.infosys.interview.preparation.core.oop.service.EmployeeService;

@RestController

public class EmployeesController {
	@Autowired
	EmployeeService dto;
	
	@GetMapping("/employeehealth")
	public String healthCheck() {
		return dto.healthCheck();
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		List<Employee> employees = dto.getEmployees();
		return  employees;
				
		
	}

}
