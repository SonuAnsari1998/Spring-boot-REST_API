package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Flight;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@GetMapping
	public String fetchFlight() {
		return "Flight details fetched";
	}

	@PostMapping
	public String addFlight(@RequestBody Flight flight) {
		return "Flight booked successfully";
	}

	@PutMapping
	public String updateFlight(@RequestBody Flight flight) {
		return "Flight booking updated successfully";
	}

	@DeleteMapping
	public String deleteFlight() {
		return "Flight booking deleted successfully";
	}
}
