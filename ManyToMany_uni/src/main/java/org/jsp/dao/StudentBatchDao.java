package org.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Batch;
import org.jsp.dto.Student;

public class StudentBatchDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manytomany_uni");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public void addStudentInBatch(Student student, int bid) {
		Batch batch = entityManager.find(Batch.class, bid);

		if (batch != null) {
			List<Batch> batches = student.getBatches();
			if (batches==null) {
				
				batches=new ArrayList<Batch>();
			}
			batches.add(batch);
			
			
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		} else {
			System.out.println("No batch found Excep");
		}

	}

}
