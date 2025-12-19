package com.infosys.interview.preparation.core.oop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.interview.preparation.core.oop.model.Manager;
import com.infosys.interview.preparation.core.oop.service.impl.ManagerServiceImpl;

@RestController
public class ManagersController {
	@Autowired
	ManagerServiceImpl Dto;
	

	
	@GetMapping("/managers")
	public List<Manager> getManagers(){
		List<Manager> managers = Dto.getAllManagers();
		return managers;
	}

}
