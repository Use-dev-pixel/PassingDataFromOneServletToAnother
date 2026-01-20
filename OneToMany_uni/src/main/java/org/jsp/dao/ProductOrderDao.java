package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Orderr;
import org.jsp.dto.Product;

public class ProductOrderDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("onetomany_uni");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveOrder(Orderr order) {
		entityTransaction.begin();
		entityManager.persist(order);
		entityTransaction.commit();
	}

	
}
