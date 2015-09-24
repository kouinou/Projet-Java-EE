package com.projetEE.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.projetEE.dao.ComputerDao;
import com.projetEE.dao.utils.DaoUtils;
import com.projetEE.entity.Company;
import com.projetEE.entity.Computer;
import com.projetEE.exception.DAOException;

public class ComputerDaoImpl implements ComputerDao {

	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/computer-database-db";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private static ComputerDao INSTANCE = null;
	
	private ComputerDaoImpl() {
		
	}
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			throw new RuntimeException("Can not load Driver", e);
		}
	}
	
	public static ComputerDao getInstance() {
		
		if (INSTANCE == null) {
			INSTANCE = new ComputerDaoImpl();
		}
		
		return INSTANCE;
	}
	@Override
	public List<Computer> getAll() {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			String sql = "SELECT computer.id, computer.name, computer.introduced, computer.discontinued, computer.company_id, company.name FROM computer INNER JOIN company ON computer.company_id = company.id;";
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Computer> computerList = new ArrayList<Computer>();
			while(resultSet.next()) {
			
				Company company = Company.builder()
						.setId(resultSet.getLong("computer.company_id"))
						.setName(resultSet.getString("company.name"))
						.build();
				
				
						
						
				
				Computer computer = Computer.builder()
						.setId(resultSet.getLong("computer.id"))
						.setName(resultSet.getString("computer.name"))
						.setIntroduced(resultSet.getTimestamp("computer.introduced"))
						.setDiscontinued(resultSet.getTimestamp("computer.discontinued"))
						.setCompany_id(resultSet.getLong("computer.company_id"))
						.setCompany(company)
						.build();
				
				
				computer.toString();
				computerList.add(computer);
			}
			
			return computerList;
			
		} catch(SQLException e) {
			
			throw new DAOException("Impossible de récupérer la liste des ordinateurs", e);
		}finally {
			DaoUtils.closeAll(resultSet, preparedStatement, connection);
		}
		
		
		
	}

	@Override
	public void insert(Computer computer) {
		// TODO Auto-generated method stub
		
	}

	
}
