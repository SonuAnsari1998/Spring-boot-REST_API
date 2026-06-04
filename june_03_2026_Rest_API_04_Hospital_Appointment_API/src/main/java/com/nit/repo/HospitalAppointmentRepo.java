package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.HospitalAppointment;

public interface HospitalAppointmentRepo extends JpaRepository<HospitalAppointment, Integer>{

}
