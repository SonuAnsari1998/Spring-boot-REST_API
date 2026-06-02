package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	private Integer mobileId;
	private String brand;
	private String model;
	private Double price;
}
