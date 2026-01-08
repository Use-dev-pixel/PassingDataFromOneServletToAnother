package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="adhar_id")
	private AdharCard adhar_card;

	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", adhar_card="
				+ adhar_card + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdharCard getAdhar_card() {
		return adhar_card;
	}

	public void setAdhar_card(AdharCard adhar_card) {
		this.adhar_card = adhar_card;
	}

}
