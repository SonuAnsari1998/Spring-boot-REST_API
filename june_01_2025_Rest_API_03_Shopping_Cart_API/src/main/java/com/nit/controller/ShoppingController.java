package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {

	@GetMapping
	public String fetchItems() {
		return "Cart items fetched";
	}

	@PostMapping
	public String addItems() {
		return "Item added to cart";
	}

	@PutMapping
	public String updateItem() {
		return "Cart updated";
	}
}
