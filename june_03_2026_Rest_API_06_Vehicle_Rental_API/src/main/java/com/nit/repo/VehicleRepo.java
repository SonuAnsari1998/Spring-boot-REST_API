package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer>{

}
