package com.infosys.interview.preparation.core.oop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.interview.preparation.core.oop.dto.ManagerDto;
import com.infosys.interview.preparation.core.oop.model.Manager;
import com.infosys.interview.preparation.core.oop.service.ManagerService;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	ManagerDto managerDto;

	@Override
	public List<Manager> getAllManagers() {
		
		return managerDto.getManager();
	}
	
	
}
