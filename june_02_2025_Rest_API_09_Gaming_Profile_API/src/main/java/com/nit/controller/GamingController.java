package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Gaming;
/*GET /players → “Player profiles fetched”

POST /players/add → “Player added successfully”

PUT /players/update → “Player profile updated successfully”

DELETE /players/delete → “Player profile deleted successfully”*/

@RestController
@RequestMapping("/gaming")
public class GamingController {

	@GetMapping("/fetch")
	public String fetchGaming() {
		return "Player profiles fetched";
	}

	@PostMapping("/booked")
	public String bookedGaming(@RequestBody Gaming gaming) {
		return "Player added successfully";
	}

	@PutMapping("/update")
	public String updateGaming(@RequestBody Gaming gaming) {
		return "Player profile updated successfully";
	}

	@DeleteMapping("/delete")
	public String deleteGaming() {
		return "Player profile deleted successfully";
	}
}
