package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Vehicle;
import com.nit.repo.VehicleRepo;

@Service
public class VehicleService {
	@Autowired
	VehicleRepo repo;

	public Vehicle addVehhicles(Vehicle vehicle) {
		return repo.save(vehicle);
	}

	public List<Vehicle> fetchAllVehicle() {
		return repo.findAll();
	}

	public Vehicle fetchVehicleById(Integer id) {
		return repo.findById(id).get();
	}

	public Vehicle updateVehicleById(Integer id, Vehicle vehicle) {
		Vehicle updateVehicle = repo.findById(id).orElseThrow(() -> new RuntimeException("Id Not found"));
		updateVehicle.setVehicleName(vehicle.getVehicleName());
		updateVehicle.setType(vehicle.getType());
		updateVehicle.setRentPerDay(vehicle.getRentPerDay());
		updateVehicle.setStatus(vehicle.getStatus());
		return repo.save(updateVehicle);
	}

	public Vehicle VehiclePriceById(Integer id, Double price) {
		Vehicle updateVehiclePrice = repo.findById(id).orElseThrow(() -> new RuntimeException("Id Not found"));
		updateVehiclePrice.setRentPerDay(price);
		return repo.save(updateVehiclePrice);
	}

	public void deleteVehicleById(Integer id) {
		repo.deleteById(id);
	}
}
