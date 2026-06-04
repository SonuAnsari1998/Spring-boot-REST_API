package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.CartItem;

public interface CartRepository extends JpaRepository<CartItem, Integer>{

}
