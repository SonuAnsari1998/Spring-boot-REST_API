package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@GetMapping
	public String fetchAppointments() {
		return "Appointments fetched";
	}

	@PostMapping
	public String bookAppointments() {
		return "Appointment booked";
	}

	@PutMapping
	public String updateAppointments() {
		return "Appointment updated";
	}
}
