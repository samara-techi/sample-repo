package com.demo.elasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("/test")
	public String test() {
		System.out.println("Team Lead change");
		System.out.println("Hai this is samara");

		return "success";
	}

}
