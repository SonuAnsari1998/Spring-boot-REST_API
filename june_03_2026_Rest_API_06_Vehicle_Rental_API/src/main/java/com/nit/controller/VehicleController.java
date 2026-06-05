package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Vehicle;
import com.nit.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	@Autowired
	VehicleService service;

	@PostMapping("/add")
	public Vehicle addVehhicles(@RequestBody Vehicle vehicle) {
		return service.addVehhicles(vehicle);
	}

	@GetMapping("/findAll")
	public List<Vehicle> fetchAllVehicle() {
		return service.fetchAllVehicle();
	}

	@GetMapping("/findById/{id}")
	public Vehicle fetchVehicleById(@PathVariable Integer id) {
		return service.fetchVehicleById(id);
	}

	@PutMapping("/update/{id}")
	public Vehicle updateVehicleById(@PathVariable Integer id, @RequestBody Vehicle vehicle) {
		return service.updateVehicleById(id, vehicle);
	}

	@PatchMapping("/updatePrice/{price}")
	public Vehicle VehiclePriceById(@PathVariable Integer id, @RequestParam Double price) {
		return service.VehiclePriceById(id, price);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteVehicleById(@PathVariable Integer id) {
		service.deleteVehicleById(id);
	}
}
