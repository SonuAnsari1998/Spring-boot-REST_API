package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Course;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("/fetch")
	public String fetchCourses() {
		return "Courses fetched";
	}

	@PostMapping("/add")
	public String addCourses(@RequestBody Course course) {
		return "Course enrolled successfully";
	}

	@PutMapping("/update")
	public String updateCourse(@RequestBody Course course) {
		return "Course enrollment updated successfully";
	}

	@DeleteMapping("/delete")
	public String deleteCourses() {
		return "Course enrollment deleted successfully";
	}

}
