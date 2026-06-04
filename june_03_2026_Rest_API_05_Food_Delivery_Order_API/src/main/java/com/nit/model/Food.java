package com.nit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FoodDelivery")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
	@Id
	private Integer orderId;
	@Column(length = 20)
	private String customerName;
	@Column(length = 20)
	private String itemName;
	private Integer quantity;
	@Column(length = 20)
	private String address;
}
