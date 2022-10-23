package com.luv2code.demo.datasources.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.demo.datasources.dao.CustomerDAO;
import com.luv2code.demo.datasources.dao.EmployeeDAO;
import com.luv2code.demo.datasources.entity.Customer;
import com.luv2code.demo.datasources.entity.Employee;

@Service
public class MultiDataSourceServiceImpl implements MultiDataSourceService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDAO.getEmployees();
	}

}
