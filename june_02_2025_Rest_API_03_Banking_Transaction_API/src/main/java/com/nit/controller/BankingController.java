package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Banking;

@RestController
@RequestMapping()
public class BankingController {
	@GetMapping("/bank/fetch")
	public String fetchTransaction() {
		return "Transactions fetched";
	}

	@PostMapping("/bank/add")
	public String addTransaction(@RequestBody Banking banking) {
		return "Transaction added successfully";
	}

	@PutMapping("/book/update")
	public String updateTransaction() {
		return "Transaction updated successfully";
	}

	public String deleteTransaction() {
		return "Transaction deleted Sucessfully";
	}
}
