package com.projetEE.service.impl;

import java.util.List;

import com.projetEE.dao.CompanyDao;
import com.projetEE.dao.impl.CompanyDaoImpl;
import com.projetEE.entity.Company;
import com.projetEE.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	
	private CompanyDao companyDao;
	
	private static CompanyService INSTANCE = null;
	
	public CompanyServiceImpl() {
		
		companyDao = CompanyDaoImpl.getInstance();
	}
	
	public static CompanyService getInstance() {
		
		if (INSTANCE == null) {
			
			INSTANCE = new CompanyServiceImpl();
		}
		
		return INSTANCE;
	}
	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		return companyDao.getAll();
	}

	@Override
	public Company getById(int id) {
		// TODO Auto-generated method stub
		return companyDao.getById(id);
	}

}
