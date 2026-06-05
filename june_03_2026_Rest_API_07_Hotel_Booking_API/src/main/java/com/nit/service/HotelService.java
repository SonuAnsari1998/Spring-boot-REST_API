package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Hotel;
import com.nit.repo.HotelRepo;

@Service
public class HotelService {
	@Autowired
	HotelRepo hotelRepo;

	public Hotel bookHotel(Hotel hotel) {
		return hotelRepo.save(hotel);
	}

	public List<Hotel> showHotels() {
		return hotelRepo.findAll();
	}

	public Hotel showHotelById(Integer id) {
		return hotelRepo.findById(id).get();
	}

	public Hotel updateHotelById(Integer id, Hotel hotel) {
		Hotel updateHotel = hotelRepo.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
		updateHotel.setCustomerName(hotel.getCustomerName());
		updateHotel.setRoomType(hotel.getRoomType());
		updateHotel.setDays(hotel.getDays());
		updateHotel.setAmount(hotel.getAmount());
		return hotelRepo.save(updateHotel);
	}

	public Hotel updateDayById(Integer id, Integer day) {
		Hotel updateHotel = hotelRepo.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
		updateHotel.setDays(day);
		return hotelRepo.save(updateHotel);
	}

	public void deleteHotelById(Integer id) {
		hotelRepo.deleteById(id);
	}

}
