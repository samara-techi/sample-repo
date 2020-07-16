package com.demo.elasticsearch.service;

import java.util.List;

import com.demo.elasticsearch.entity.Employee;

public interface EmployeeService {
	
	String createEmployee(Employee employee);
	
	Employee getEmployeeById(String id);
	
	List<Employee> getAllEmployees();
	
	String deleteEmployee(String id);
	

}
