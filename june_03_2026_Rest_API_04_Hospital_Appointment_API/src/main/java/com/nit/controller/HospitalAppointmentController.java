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

import com.nit.model.HospitalAppointment;
import com.nit.service.HospitalAppointmentService;

@RestController
@RequestMapping("/appointment")
public class HospitalAppointmentController {

	@Autowired
	HospitalAppointmentService appointmentService;

	@PostMapping("/book")
	public HospitalAppointment bookAppointment(@RequestBody HospitalAppointment hospitalAppointment) {
		return appointmentService.bookAppointment(hospitalAppointment);
	}

	@GetMapping("/fetchAll")
	public List<HospitalAppointment> fetchAllAppointments() {
		return appointmentService.fetchAllAppointments();
	}

	@GetMapping("/fetchById/{id}")
	public HospitalAppointment findAppointmentById(@PathVariable Integer id) {
		return appointmentService.findAppointmentById(id);
	}

	@PutMapping("/update/{id}")
	public HospitalAppointment updateAppointmentById(@PathVariable Integer id,
			@RequestBody HospitalAppointment hospitalAppointment) {
		return appointmentService.updateAppointmentById(id, hospitalAppointment);
	}

	@PatchMapping("/updateTime/{id}")
	public HospitalAppointment updateAppointmentTimeById(@PathVariable Integer id, @RequestParam String time) {
		return appointmentService.updateAppointmentTimeById(id, time);
	}
	
	@DeleteMapping("/delete")
	public void deleteAppointmentById(@PathVariable Integer id) {
		appointmentService.deleteAppointmentById(id);
	}
}
