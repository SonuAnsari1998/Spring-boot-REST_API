package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.FlightBooking;
import com.nit.service.FlightBookingService;

@RestController
@RequestMapping("/flights")
public class FlightBookingController {

	@Autowired
	private FlightBookingService service;

	@PostMapping("/book")
	public FlightBooking bookFlight(@RequestBody FlightBooking booking) {
		return service.bookFlight(booking);
	}

	@GetMapping
	public List<FlightBooking> getAllBookings() {
		return service.getAllBookings();
	}

	@GetMapping("/{id}")
	public FlightBooking getBookingById(@PathVariable Long id) {
		return service.getBookingById(id);
	}

	@PutMapping("/update/{id}")
	public FlightBooking updateBooking(@PathVariable Long id, @RequestBody FlightBooking booking) {
		return service.updateBooking(id, booking);
	}

	@PatchMapping("/price/{id}")
	public FlightBooking updatePrice(@PathVariable Long id, @RequestBody Map<String, Double> request) {

		Double price = request.get("ticketPrice");
		return service.updatePrice(id, price);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBooking(@PathVariable Long id) {
		return service.deleteBooking(id);
	}
}
