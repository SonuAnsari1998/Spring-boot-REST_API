package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.FlightBooking;
import com.nit.repo.FlightBookingRepository;

@Service
public class FlightBookingService {

	@Autowired
	private FlightBookingRepository repository;

	public FlightBooking bookFlight(FlightBooking booking) {
		return repository.save(booking);
	}

	public List<FlightBooking> getAllBookings() {
		return repository.findAll();
	}

	public FlightBooking getBookingById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public FlightBooking updateBooking(Long id, FlightBooking updatedBooking) {

		FlightBooking booking = repository.findById(id).orElse(null);

		if (booking != null) {
			booking.setPassengerName(updatedBooking.getPassengerName());
			booking.setFlightName(updatedBooking.getFlightName());
			booking.setSource(updatedBooking.getSource());
			booking.setDestination(updatedBooking.getDestination());
			booking.setTicketPrice(updatedBooking.getTicketPrice());

			return repository.save(booking);
		}

		return null;
	}

	public FlightBooking updatePrice(Long id, Double price) {

		FlightBooking booking = repository.findById(id).orElse(null);

		if (booking != null) {
			booking.setTicketPrice(price);
			return repository.save(booking);
		}

		return null;
	}

	public String deleteBooking(Long id) {

		FlightBooking booking = repository.findById(id).orElse(null);

		if (booking != null) {
			repository.deleteById(id);
			return "Booking Deleted Successfully";
		}

		return "Booking Not Found";
	}
}