package com.projetEE.service.impl;

import java.util.List;

import com.projetEE.dao.ComputerDao;
import com.projetEE.dao.impl.ComputerDaoImpl;
import com.projetEE.entity.Computer;
import com.projetEE.service.ComputerService;

public class ComputerServiceImpl implements ComputerService {

	
	private ComputerDao computerDao;
	
	private static ComputerService INSTANCE = null;
	
	public ComputerServiceImpl() {
		
		this.computerDao = ComputerDaoImpl.getInstance();
	}
	
	public static ComputerService getInstance() {
		
		if (INSTANCE == null) {
			
			INSTANCE = new ComputerServiceImpl();
		}
		
		return INSTANCE;
	}
	@Override
	public List<Computer> getAll() {
		// TODO Auto-generated method stub
		return computerDao.getAll();
	}

	@Override
	public void insert(Computer computer) {
		// TODO Auto-generated method stub
		computerDao.insert(computer);
		
	}

}
