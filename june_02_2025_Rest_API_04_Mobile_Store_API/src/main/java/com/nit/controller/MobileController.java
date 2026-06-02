package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MobileController {

	@GetMapping("/mobile/fetch")
	public String fetchMobile() {
		return "Mobile list fetched";
	}

	@PostMapping("/mobile/add")
	public String addMobile() {
		return "Mobile added successfully";
	}

	@DeleteMapping("/mobile/delete")
	public String deleteMobile() {
		return "Mobile deleted successfully";
	}

}
