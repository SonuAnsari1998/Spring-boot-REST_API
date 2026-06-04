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

import com.nit.model.Food;
import com.nit.service.FoodService;

@RestController
@RequestMapping("/order")
public class FoodController {
	@Autowired
	FoodService foodService;

	@PostMapping("/add")
	public Food addOrder(@RequestBody Food food) {
		return foodService.addOrder(food);
	}

	@GetMapping("/viewAll")
	public List<Food> showAllOrder() {
		return foodService.showAllOrder();
	}

	@GetMapping("/viewById/{id}")
	public Food showOrderById(@PathVariable Integer id) {
		return foodService.showOrderById(id);
	}
	
	@PutMapping("/update/{id}")
	public Food updateOrderById(@PathVariable Integer id, @RequestBody Food food) {
		return foodService.updateOrderById(id, food);
	}

	@PatchMapping("/updateAdd/{id}")
	public Food updateAddressById(@PathVariable Integer id, @RequestParam String add) {
		return foodService.updateAddressById(id, add);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOrder(@PathVariable Integer id) {
		foodService.deleteOrder(id);
	}
}
