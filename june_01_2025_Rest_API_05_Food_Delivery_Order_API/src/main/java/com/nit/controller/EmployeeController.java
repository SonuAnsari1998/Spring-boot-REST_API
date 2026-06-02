package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping
	public String fetchEmployee() {
		return "Employee list fetched";
	}

	@PostMapping
	public String addEmployee() {
		return "Employee added successfully";
	}

	@PutMapping
	public String updateEmployee() {
		return "Employee updated successfully";
	}

	@DeleteMapping
	public String deleteEmployee() {
		return "Employee deleted successfully";
	}
}
