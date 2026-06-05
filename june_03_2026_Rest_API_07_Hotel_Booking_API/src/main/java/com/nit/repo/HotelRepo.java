package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer>{

}
