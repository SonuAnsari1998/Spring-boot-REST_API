package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Pharmacy;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

	@GetMapping("/fetch")
	public String fetchPharmacy() {
		return "Medicine list fetched";
	}

	@PostMapping("/booked")
	public String bookedPharmacy(@RequestBody Pharmacy pharmacy) {
		return "Medicine added successfully";
	}

	@PutMapping("/update")
	public String updatePharmacy(@RequestBody Pharmacy pharmacy) {
		return "Medicine updated successfully";
	}

	@DeleteMapping("/delete")
	public String deletePharmacy() {
		return "Medicine deleted successfully";
	}
}
