package com.nit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "HospitalAppointment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalAppointment {
	@Id
	private Integer appointmentId;
	@Column(length = 20)
	private String patientName;
	@Column(length = 20)
	private String doctorName;
	@Column(length = 20)
	private String appointmentDate;
	@Column(length = 20)
	private String appointmentTime;
}
