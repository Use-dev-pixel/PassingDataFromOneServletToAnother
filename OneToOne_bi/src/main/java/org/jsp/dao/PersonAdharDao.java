package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonAdharDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("onetoone_bi_CRUD");
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
	
	
	public void deletePersonById(int id) {
		Person person=entityManager.find(Person.class, id);
		if (person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			System.out.println("Person Removed");
		} else {
			System.out.println("Person not found To remove");
		}
	}
	
	

	public void findAdharById(int id) {
		AdharCard card = entityManager.find(AdharCard.class, id);
		if (card != null) {
			System.out.println(card);
			System.out.println(card.getPerson());
		} else {
			System.out.println("Adhar Card Not Found");// CE
		}
	}

	public void findPersonById(int id) {
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			System.out.println(person);
		} else {
			System.out.println("Person Not Found");// CE
		}
	}

}
