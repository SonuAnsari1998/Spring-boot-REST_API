package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	private Integer enrollmentId;
	private String studentName;
	private String courseName;
	private Double fee;

}
