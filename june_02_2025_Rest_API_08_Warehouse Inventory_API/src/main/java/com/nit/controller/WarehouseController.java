package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Warehouse;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

	@GetMapping("/fetch")
	public String fetchWarehouse() {
		return "Inventory fetched";
	}

	@PostMapping("/booked")
	public String bookedWarehouse(@RequestBody Warehouse warehouse) {
		return "Item added successfully";
	}

	@PutMapping("/update")
	public String updateWarehouse(@RequestBody Warehouse warehouse) {
		return "Inventory updated successfully";
	}

	@DeleteMapping("/delete")
	public String deleteWarehouse() {
		return "Inventory deleted successfully";
	}
}
