package com.infosys.interview.preparation.core.oop.controller;

import java.util.ArrayList;
import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.interview.preparation.core.oop.model.Employee;
import com.infosys.interview.preparation.core.oop.model.Manager;
import com.infosys.interview.preparation.core.oop.service.impl.EmployeeServiceImpl;
import com.infosys.interview.preparation.core.oop.service.impl.ManagerServiceImpl;

@RestController
public class AllController {
	
	private static final Logger log = LoggerFactory.getLogger(AllController.class);
	@Autowired
	ManagerServiceImpl managerServiceImpl;
	
	@Autowired 
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees(){
		
		log.info("AllController: Call");
		
		List<Employee> allEmployees = new ArrayList<>();
		
		List<Employee> employees = employeeServiceImpl.getEmployees();
		List<Manager> managers = managerServiceImpl.getAllManagers();
		
		log.debug("Employee Count: " +  employees.size());
		log.debug("Manager Count: " + managers.size());
		
		allEmployees.addAll(employees);
		allEmployees.addAll(managers);
		
		log.debug("Total Employees: " + allEmployees.size());
		
		
		
		return allEmployees;
	}

	

}
