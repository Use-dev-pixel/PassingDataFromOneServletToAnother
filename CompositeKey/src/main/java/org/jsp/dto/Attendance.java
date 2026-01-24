package org.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Attendance {

	@EmbeddedId
	private AttendanceId id;
	private String status;

	public AttendanceId getId() {
		return id;
	}

	public void setId(AttendanceId id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
