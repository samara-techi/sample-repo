package com.demo.elasticsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.elasticsearch.entity.Employee;
import com.demo.elasticsearch.service.EmployeeService;

@RestController
@RequestMapping("/employee-ctrl")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/test")
	public String test() {
		return "success";
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") String id) {
		return employeeService.deleteEmployee(id);
		
	}
	
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	

}
