package com.nit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "accountsT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	private Long accountNumber;
	private String holderName;
	private String accountType;
	private Double balance;
	private String branch;
}
