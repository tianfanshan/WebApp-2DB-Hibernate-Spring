package com.luv2code.demo.datasources.service;

import java.util.List;

import com.luv2code.demo.datasources.entity.Customer;
import com.luv2code.demo.datasources.entity.Employee;

public interface MultiDataSourceService {

	public List<Customer> getCustomers();
	
	public List<Employee> getEmployees();
	
}
