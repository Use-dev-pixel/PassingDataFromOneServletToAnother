package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Person;

public class PersonAdharDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("onetoone_uni");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}

	public void updatePerosn(Person person) {
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}

	public void removePerson(int id) {
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			System.out.println("Person Removed Successfully");
		} else {
			System.out.println("No User Found");
			// UserNotFoundException
		}

	}

	public void findPersonByEmail(String email) {
		//ex1
//		Query query=entityManager.createQuery("SELECT person FROM Person person WHERE person.email = ?1");
//		query.setParameter(1, email);
//		Person person = (Person)query.getSingleResult();
//		if (person!=null) {
//			System.out.println(person);
//		} else {
//			System.out.println("Person Not Found");//CE
//		}
		
		
		
		//ex2
//		Query query=entityManager.createQuery("SELECT person FROM Person person WHERE person.email = :email");
//		query.setParameter("email", email);
//		Person person = (Person)query.getSingleResult();
//		if (person!=null) {
//			System.out.println(person);
//		} else {
//			System.out.println("Person Not Found");//CE
//		}

		
		
	}
}
