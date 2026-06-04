package com.nit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "StudentManagement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private Integer id;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String course;
	@Column(length = 20)
	private String email;
	@Column(length = 20)
	private String mobile;
}
