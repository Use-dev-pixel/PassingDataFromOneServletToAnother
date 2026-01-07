package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonAdharCardController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("onetoone_uni");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		AdharCard card = new AdharCard();
		card.setId(101);
		card.setAdharNumber(234263647182l);
		card.setDateOfBirth("26-08-1932");
		card.setAddress("Egypt");
		
		
		Person person=new Person();
		person.setId(1);
		person.setName("pavani");
		person.setEmail("pavani@kfc.in");
		person.setPassword("Pkfc@avani");
		person.setAdhar_card(card);
		
		
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
}
