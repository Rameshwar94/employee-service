package com.javatutorials.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatutorials.employeeservice.entity.Employee;

@RestController
public class EmployeeController {

	@GetMapping(path="/all-employees")
	public Employee getEmployees(){
		
		return new Employee();
	}
}
