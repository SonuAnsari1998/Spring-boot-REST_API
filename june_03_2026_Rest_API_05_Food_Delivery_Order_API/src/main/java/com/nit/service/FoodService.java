package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Food;
import com.nit.repo.FoodRepo;

@Service
public class FoodService {
	@Autowired
	FoodRepo foodRepo;

	public Food addOrder(Food food) {
		return foodRepo.save(food);
	}

	public List<Food> showAllOrder() {
		return foodRepo.findAll();
	}

	public Food showOrderById(Integer id) {
		return foodRepo.findById(id).get();
	}

	public Food updateOrderById(Integer id, Food food) {
		Food updateFood = foodRepo.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
		updateFood.setCustomerName(food.getCustomerName());
		updateFood.setItemName(food.getItemName());
		updateFood.setQuantity(food.getQuantity());
		updateFood.setAddress(food.getAddress());
		return foodRepo.save(updateFood);
	}

	public Food updateAddressById(Integer id, String add) {
		Food updateAddress = foodRepo.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
		updateAddress.setAddress(add);
		return foodRepo.save(updateAddress);
	}

	public void deleteOrder(Integer id) {
		foodRepo.deleteById(id);
	}

}
