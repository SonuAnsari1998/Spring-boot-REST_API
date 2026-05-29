package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	@GetMapping
	public String getAllBook() {
		return "All books fetched";
	}
	@PostMapping
	public String addBook() {
		return "Book added";
	}
	
	@PutMapping
	public String updateBook() {
		return "Book updated";
	}
}
