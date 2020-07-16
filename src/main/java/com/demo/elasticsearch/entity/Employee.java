package com.demo.elasticsearch.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	private String id;
	private String name;
	private String title;
	private double salaryUSD; //"salary_usd": 140000,
	//"hiredate": "Oct 10, 2010"
	
	public Employee() {}
	public Employee(String id, String name, String title, double salaryUSD) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.salaryUSD = salaryUSD;
	}

}
