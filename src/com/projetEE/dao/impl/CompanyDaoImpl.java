package com.projetEE.dao.impl;

import java.util.List;


import com.projetEE.dao.CompanyDao;
import com.projetEE.entity.Company;

public class CompanyDaoImpl implements CompanyDao {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/computer-database-db";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private static CompanyDao INSTANCE = null;
	
	private CompanyDaoImpl() {
		
	}
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			throw new RuntimeException("Can not load Driver", e);
		}
	}
	
	public static CompanyDao getInstance(){
		if(INSTANCE == null) {
			INSTANCE = new CompanyDaoImpl();
		}
		return INSTANCE;
	}
	
	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
