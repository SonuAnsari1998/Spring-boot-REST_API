package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.model.FlightBooking;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {

}
