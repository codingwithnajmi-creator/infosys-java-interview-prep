package com.infosys.interview.preparation.core.oop.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.infosys.interview.preparation.core.oop.model.Employee;
import com.infosys.interview.preparation.core.oop.model.Manager;

@Component
public class ManagerDto {
	
	public List<Manager> getManager(){
		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager(1,"Khalid", 19000, 250));
		managers.add(new Manager(2, "Shahid", 99000, 55000));
		return managers;
	}

}	