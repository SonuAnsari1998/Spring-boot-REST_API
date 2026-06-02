package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nit.model.Cab;

@RestController
@RequestMapping("/cab")
public class CabController {

	@GetMapping("/fetch")
	public String fetchCab() {
		return "Cab bookings fetched";
	}

	@PostMapping("/booked")
	public String bookedCab(@RequestBody Cab cab) {
		return "Cab booked successfully";
	}

	@PutMapping("/update")
	public String updateCab(@RequestBody Cab cab) {
		return "Cab booking updated successfully";
	}

	@DeleteMapping("/delete")
	public String deleteCab() {
		return "Cab booking deleted successfully";
	}

}
