package com.projetEE.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.projetEE.entity.Company.Builder;

@Entity
@Table(name="company")
public class Company {

	@Id
	private long id;
	private String name;
	
	
	public Company() {
		
	}

	public Company(long id, String name) {
		
		this.id = id;
		this.name = name;
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
	
	public static Builder builder() {
		
		return new Builder();
	}
	
	public static class Builder {
		
		Company company;
		
		public Builder(){
			company = new Company();
		}
		
		public Builder setId(long id) {
			
			company.id = id;
			return this;
		}
		
		public Builder setName(String name) {
			
			company.name = name;
			return this;
		}
		
		public Company build() {
			
			return company;
		}
		
		
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}
	
	
}
