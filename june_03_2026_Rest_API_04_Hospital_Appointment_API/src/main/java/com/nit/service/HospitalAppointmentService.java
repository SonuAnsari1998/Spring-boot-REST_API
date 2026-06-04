package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.model.HospitalAppointment;
import com.nit.repo.HospitalAppointmentRepo;

@Service
public class HospitalAppointmentService {
	@Autowired
	HospitalAppointmentRepo appointmentRepo;

	public HospitalAppointment bookAppointment(HospitalAppointment hospitalAppointment) {
		return appointmentRepo.save(hospitalAppointment);
	}

	public List<HospitalAppointment> fetchAllAppointments() {
		return appointmentRepo.findAll();
	}

	public HospitalAppointment findAppointmentById(Integer id) {
		return appointmentRepo.findById(id).get();
	}

	public HospitalAppointment updateAppointmentById(Integer id, HospitalAppointment hospitalAppointment) {
		HospitalAppointment updateAppointment = appointmentRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Id " + id + " Not Found"));
		updateAppointment.setPatientName(hospitalAppointment.getPatientName());
		updateAppointment.setDoctorName(hospitalAppointment.getDoctorName());
		updateAppointment.setAppointmentDate(hospitalAppointment.getAppointmentDate());
		updateAppointment.setAppointmentTime(hospitalAppointment.getAppointmentTime());
		return appointmentRepo.save(updateAppointment);
	}

	public HospitalAppointment updateAppointmentTimeById(Integer id, String time) {
		HospitalAppointment updateTime = appointmentRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Id " + id + " Not Found"));
		updateTime.setAppointmentTime(time);
		return appointmentRepo.save(updateTime);
	}

	public void deleteAppointmentById(Integer id) {
		appointmentRepo.deleteById(id);
	}
}
