package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{
	
}
