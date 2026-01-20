package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Batch {
	@Id
	private int bid;
	private String date;
	private String time;
	private String trainerName;
	private String subjectName;

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", date=" + date + ", time=" + time + ", trainerName=" + trainerName
				+ ", subjectName=" + subjectName + "]";
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
