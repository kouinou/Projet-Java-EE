package com.projetEE.dao;

import java.util.List;

import com.projetEE.entity.Computer;
public interface ComputerDao {
	
	List<Computer> getAll();
	
	void insert(Computer computer);
	

}
