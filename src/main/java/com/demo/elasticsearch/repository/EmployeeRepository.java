package com.demo.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.demo.elasticsearch.entity.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

}
