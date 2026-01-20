package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class StudentBatchDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manytomany_bi");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

}
