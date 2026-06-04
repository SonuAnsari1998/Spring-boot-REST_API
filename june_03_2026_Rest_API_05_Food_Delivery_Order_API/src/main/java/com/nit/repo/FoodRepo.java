package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Food;

public interface FoodRepo extends JpaRepository<Food, Integer>{

}
