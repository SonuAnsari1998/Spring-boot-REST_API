package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banking {
	private Integer transactionId;
	private String accountHolderName;
	private String transactionType;
	private Double amount;
}
