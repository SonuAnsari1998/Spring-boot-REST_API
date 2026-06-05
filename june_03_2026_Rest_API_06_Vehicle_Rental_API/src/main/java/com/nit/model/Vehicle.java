package com.nit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "VehicleRental")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
	@Id
	private Integer vehicleId;
	@Column(length = 20)
	private String vehicleName;
	@Column(length = 20)
	private String type;
	private Double rentPerDay;
	@Column(length = 20)
	private String status;
}
