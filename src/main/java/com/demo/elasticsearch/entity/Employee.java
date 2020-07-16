package com.demo.elasticsearch.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(indexName = "employees", type = "_doc")
public class Employee {
	@Id
	private String id;
	private String name;
	private String title;
	private double salary_usd;
	//"hiredate": "Oct 10, 2010"
	
	public Employee() {}
	public Employee(String id, String name, String title, double salary_usd) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.salary_usd = salary_usd;
	}

}
