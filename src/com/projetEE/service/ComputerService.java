package com.projetEE.service;

import java.util.List;

import com.projetEE.entity.Computer;

public interface ComputerService {

	List<Computer> getAll();
	
	void insert (Computer computer);
}
