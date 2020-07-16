package com.demo.elasticsearch.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	private Date hiredate = new Date();
	//"hiredate": "Oct 10, 2010"
	
	public Employee() {}
	public Employee(String id, String name, String title, double salary_usd, Date hiredate) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.salary_usd = salary_usd;
		this.hiredate = hiredate;
	}

}
