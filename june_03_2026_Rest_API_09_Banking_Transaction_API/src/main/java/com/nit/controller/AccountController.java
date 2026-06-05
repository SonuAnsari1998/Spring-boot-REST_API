package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Account;
import com.nit.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService service;

	// POST /accounts/create
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}

	// GET /accounts
	@GetMapping
	public List<Account> getAllAccounts() {
		return service.getAllAccounts();
	}

	// GET /accounts/{id}
	@GetMapping("/{id}")
	public Account getAccountById(@PathVariable Long id) {
		return service.getAccountById(id);
	}

	// PUT /accounts/update/{id}
	@PutMapping("/update/{id}")
	public Account updateAccount(@PathVariable Long id, @RequestBody Account account) {
		return service.updateAccount(id, account);
	}

	// PATCH /accounts/balance/{id}
	@PatchMapping("/balance/{id}")
	public Account updateBalance(@PathVariable Long id, @RequestBody Map<String, Double> request) {

		Double balance = request.get("balance");
		return service.updateBalance(id, balance);
	}

	// DELETE /accounts/delete/{id}
	@DeleteMapping("/delete/{id}")
	public String deleteAccount(@PathVariable Long id) {
		return service.deleteAccount(id);
	}
}
