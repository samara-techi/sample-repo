package com.demo.elasticsearch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.elasticsearch.entity.Employee;
import com.demo.elasticsearch.repository.EmployeeRepository;
import com.demo.elasticsearch.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public String createEmployee(Employee employee) {
		String status = "updated";
		if(employee.getId() == null) status = "created";
		employeeRepo.save(employee);
		
		return "Employee " + employee.getId() + " " + status;
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepo.findById(id).orElse(null);
	}

	@Override
	public String deleteEmployee(String id) {
		Employee employee = employeeRepo.findById(id).orElse(null);
		if(employee != null) {
			employeeRepo.delete(employee);
			return "Employee " + id + " is deleted.";
		}
		return "Employee not found";
	}


	@Override
	public List<Employee> getAllEmployees() {
		//return employees;
		List<Employee> employees = new ArrayList<>();
		Iterable<Employee> iterable = employeeRepo.findAll();
		for (Employee employee : iterable) {
			employees.add(employee);
		}
		return employees;
	}

}
