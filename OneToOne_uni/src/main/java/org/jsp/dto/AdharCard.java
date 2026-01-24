package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {
	@Id
	private int id;
	private long adharNumber;
	private String address;
	private String dateOfBirth;

	//getters and setters
	
	@Override
	public String toString() {
		return "AdharCard [id=" + id + ", adharNumber=" + adharNumber + ", address=" + address + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
