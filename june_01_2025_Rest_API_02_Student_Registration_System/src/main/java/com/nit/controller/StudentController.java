package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping
	public String fetchStudents() {
		return "Student list fetched";
	}

	@PostMapping
	public String register() {
		return "Student registered successfully";
	}

	@PutMapping
	public String update() {
		return "Student Updated successfully";
	}
}
