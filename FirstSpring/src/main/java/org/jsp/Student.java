package org.jsp;

import java.util.List;

public class Student {
	String name;
	String email;
	String password;
	long number;
	List<String> subjects;

	public Student(String name, String email, String password, long number, List<String> subjects) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", passsword=" + password + ", number=" + number
				+ ", subjects=" + subjects + "]";
	}

}
