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

import com.nit.model.Hotel;
import com.nit.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	HotelService hotelService;

	@PostMapping("/book")
	public Hotel bookHotel(@RequestBody Hotel hotel) {
		return hotelService.bookHotel(hotel);
	}

	@GetMapping("/showHotels")
	public List<Hotel> showHotels() {
		return hotelService.showHotels();
	}

	@GetMapping("/showHotelsById/{id}")
	public Hotel showHotelById(@PathVariable Integer id) {
		return hotelService.showHotelById(id);
	}

	@PutMapping("/update/{id}")
	public Hotel updateHotelById(@PathVariable Integer id, @RequestBody Hotel hotel) {
		return hotelService.updateHotelById(id, hotel);
	}

	@PatchMapping("/updateDay/{id}")
	public Hotel updateDayById(@PathVariable Integer id, @RequestParam Integer day) {
		return hotelService.updateDayById(id, day);
	}

	@DeleteMapping("/delete")
	public void deleteHotelById(Integer id) {
		hotelService.deleteHotelById(id);
	}

}
