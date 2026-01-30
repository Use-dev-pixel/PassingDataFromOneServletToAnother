package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class StudentDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("first");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	
	public void saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
	}
}
