package com.nit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LibraryManagement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	private Integer id;
	@Column(length = 20)
	private String title;
	@Column(length = 20)
	private String author;
	@Column(length = 20)
	private String genre;
	private Double price;
}
