package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

	@GetMapping
	public String fetchFood() {
		return "Orders fetched";
	}

	@PostMapping
	public String addFood() {
		return "Order placed successfully";
	}

	@PutMapping
	public String updateFood() {
		return "Order updated successfully";
	}
}
