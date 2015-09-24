package com.projetEE.service;

import java.util.List;

import com.projetEE.entity.Company;

public interface CompanyService {

	List <Company> getAll();
	
	Company getById (int id);
}
