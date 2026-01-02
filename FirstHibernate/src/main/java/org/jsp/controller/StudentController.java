package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class StudentController {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("first");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Karthik(Golu)");
		student.setEmail("karthik@golu.in");
		student.setPassword("Goli@12345");
		student.setAddress("Prem Sir's <3");
		
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		
		
	}
}
