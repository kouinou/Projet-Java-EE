package com.projetEE.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "computers")
public class Computer {
	@Id
	private long id;
	private String name;
	private Timestamp introduced;
	private Timestamp discontinued;
	private long company_id;
	private Company company;
	
	
	public Computer(){
		
	}
	
	public Computer(long id, String name, Timestamp introduced, Timestamp discontinued, long company_id, Company company) {
		
		this.id = id;
		this.name = name;
		this.introduced = introduced;
		this.discontinued = discontinued;
		this.company_id = company_id;
		this.company = company;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getIntroduced() {
		return introduced;
	}

	public void setIntroduced(Timestamp introduced) {
		this.introduced = introduced;
	}

	public Timestamp getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Timestamp discontinued) {
		this.discontinued = discontinued;
	}

	public long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}

	public Company getCompany() {
		return this.company;
	}
	
	public void setCompany (Company company) {
		
		this.company = company;
	}
	public static Builder builder(){
		return new Builder();
	}
	
	public static class Builder {
		
		private Computer computer;
		
		public Builder(){
			
			computer = new Computer();
		}
		
		public Builder setId(long id){
			
			computer.id = id;
			return this;
		}
		
		public Builder setName(String name) {
			
			computer.name = name;
			return this;
		}
		
		public Builder setIntroduced(Timestamp introduced) {
			
			computer.introduced = introduced;
			return this;
		}
		
		public Builder setDiscontinued(Timestamp discontinued) {
			
			computer.discontinued = discontinued;
			return this;
		}
		
		public Builder setCompany_id(Long company_id) {
			
			computer.company_id = company_id;
			return this;
		}
		
		public Builder setCompany(Company company) {
			
			computer.company = company;
			return this;
		}
		
		public Computer build(){
			
			return computer;
		}

		
		
		
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", introduced=" + introduced + ", discontinued=" + discontinued
				+ ", company_id=" + company_id + "]";
	}
	
	
	
	

	
}
