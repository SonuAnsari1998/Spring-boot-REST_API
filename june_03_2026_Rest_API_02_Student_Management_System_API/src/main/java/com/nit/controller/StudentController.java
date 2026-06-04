package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Student;
import com.nit.service.StudentService;

@RestController
@RequestMapping
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/register")
	public Student addStudent(@RequestBody Student stu) {
		return service.registerStudent(stu);
	}

	@GetMapping("/fetchAll")
	public List<Student> viewAllStudent() {
		return service.fetchAllStudent();
	}

	@GetMapping("view/{id}")
	public Student viewById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable Integer id, @RequestBody Student stu) {
		return service.updateStudent(id, stu);
	}

	@PatchMapping("/email/{id}")
	public Student updateEmailById(@PathVariable Integer id, @RequestParam String email) {
		return service.updateStudentEmail(id, email);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable Integer id) {
		service.deleteStudent(id);
	}
}
