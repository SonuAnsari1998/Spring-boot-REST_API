package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacy {
	private Integer medicineId;
	private String medicineName;
	private String company;
	private Double price;
}
