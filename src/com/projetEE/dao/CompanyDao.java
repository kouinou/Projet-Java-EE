package com.projetEE.dao;

import java.util.List;

import com.projetEE.entity.Company;

public interface CompanyDao {

	List<Company> getAll();
	
	Company getById (int id);
	
}
