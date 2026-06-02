package com.nit.controller;


 
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
