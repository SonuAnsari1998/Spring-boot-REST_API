package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
