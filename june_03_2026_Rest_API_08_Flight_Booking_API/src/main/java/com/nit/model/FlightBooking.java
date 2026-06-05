package com.nit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "flight_bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBooking {
    @Id
    private Long bookingId;
    private String passengerName;
    private String flightName;
    private String source;
    private String destination;
    private Double ticketPrice;
}