package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonAdharDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("onetoone_bi");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void saveAdharCard(AdharCard card) {
		entityTransaction.begin();
		entityManager.persist(card);
		entityTransaction.commit();
	}

}
