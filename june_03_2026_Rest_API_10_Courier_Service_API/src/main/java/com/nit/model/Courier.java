package com.nit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "couriers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Courier {

	@Id
	private Long courierId;

	private String senderName;

	private String receiverName;

	private String city;

	private String deliveryStatus;
}
