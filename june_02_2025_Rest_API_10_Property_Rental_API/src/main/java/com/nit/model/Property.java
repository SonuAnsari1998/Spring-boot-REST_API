package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {
	private Integer propertyId;
	private String ownerName;
	private String propertyType;
	private Double rent;
}
