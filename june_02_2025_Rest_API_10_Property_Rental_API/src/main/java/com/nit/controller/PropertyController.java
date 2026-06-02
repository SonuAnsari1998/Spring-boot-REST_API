package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Property;

@RestController
@RequestMapping("/property")
public class PropertyController {

	@GetMapping("/fetch")
	public String fetchProperty() {
		return "Properties fetched";
	}

	@PostMapping("/booked")
	public String bookedProperty(@RequestBody Property property) {
		return "Property added successfully";
	}

	@PutMapping("/update")
	public String updateProperty(@RequestBody Property property) {
		return "PProperty updated successfully";
	}

	@DeleteMapping("/delete")
	public String deleteProperty() {
		return "Property deleted successfully";
	}
}
