package com.demo.elasticsearch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.elasticsearch.entity.Employee;
import com.demo.elasticsearch.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final List<Employee> employees = new ArrayList<>();
	
	static {
		employees.add(new Employee("2", "Samara", "Software Engineer", 10000));
		employees.add(new Employee("3", "Kavi raja", "Software Engineer", 15000));
		employees.add(new Employee("4", "Ravi Raja", "Driver", 5000));
		employees.add(new Employee("5", "Kapi Raja", "Software Engineer", 10000));
		employees.add(new Employee("6", "Nick Jonas", "VLSI", 40000));
		employees.add(new Employee("7", "Akash", "Business", 60000));
	}
	
	@Override
	public String createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getId() == null) {
			//save the employee
			//generate the id of an employee
			employee.setId(Integer.toString((Integer.parseInt((employees.get(employees.size()-1).getId()))+1)));
			employees.add(employee);
			return "Employee with id " + employee.getId() + " is created.";
		} else {
			//update the employee
			for(int i = 0; i<employees.size(); i++) {
				if(employees.get(i).getId().equals(employee.getId())) {
					employees.set(i, employee);
					return "Employee with id " + employee.getId() + " is updated.";
				}
			}
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employees.stream().filter(employee -> employee.getId().equals(id))
				                 .findFirst().orElse(null);
	}

	@Override
	public String deleteEmployee(String id) {
		for(int i = 0; i<employees.size(); i++) {
			if(employees.get(i).getId().equals(id)) {
				employees.remove(i);
				return "Employee " + id + " deleted";
			}
				
		}
		return null;
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}

}
