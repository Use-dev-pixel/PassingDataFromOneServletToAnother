package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Product;

public class ProductOrderDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manytoone_uni");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
	}

	
}
