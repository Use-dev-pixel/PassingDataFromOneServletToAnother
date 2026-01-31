package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class StudentController {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lifecycle");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Student student = new Student();
		student.setId(3);
		student.setName("Test");
		student.setEmail("test@QFC.com");
		student.setPassword("test@12345");
		student.setAddress("test");
		
		
		
		transaction.begin();
		
		manager.persist(student);
		student.setName("demo");
		transaction.commit();
		manager.clear();
		
		student.setName("Useless");
		
		

	}
}
