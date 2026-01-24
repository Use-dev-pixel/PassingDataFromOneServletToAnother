package org.jsp.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;



@Embeddable
public class AttendanceId implements Serializable {
	
	private int empId;
	private LocalDate date;
	private String location;
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
