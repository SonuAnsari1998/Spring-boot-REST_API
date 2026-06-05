package com.nit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "HotelBooking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
	@Id
	private Integer bookingId;
	@Column(length = 20)
	private String customerName;
	@Column(length = 20)
	private String roomType;
	private Integer days;
	private Double amount;
}
