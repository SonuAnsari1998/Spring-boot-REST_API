package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cab {
	private Integer bookingId;
	private String customerName;
	private String pickupLocation;
	private Double fare;

}
