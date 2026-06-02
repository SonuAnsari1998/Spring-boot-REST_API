package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
	Integer bookingId;
	String passengerName;
	String flightName;
	Double ticketPrice;
}
