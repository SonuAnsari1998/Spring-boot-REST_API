package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Student;
import com.nit.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;

	public Student registerStudent(Student stu) {
		return repo.save(stu);
	}

	public List<Student> fetchAllStudent() {
		return repo.findAll();
	}

	public Student findById(Integer id) {
		return repo.findById(id).get();
	}

	public Student updateStudent(Integer id, Student stu) {
		Student updatedStu = repo.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
		updatedStu.setName(stu.getName());
		updatedStu.setCourse(stu.getCourse());
		updatedStu.setEmail(stu.getEmail());
		updatedStu.setMobile(stu.getMobile());
		return repo.save(updatedStu);
	}

	public Student updateStudentEmail(Integer id, String email) {
		Student updateEmail = repo.findById(id).orElseThrow(() -> new RuntimeException("id Not Found " + id));
		updateEmail.setEmail(email);
		return repo.save(updateEmail);
	}

	public void deleteStudent(Integer stu) {
		repo.deleteById(stu);
	}
}
