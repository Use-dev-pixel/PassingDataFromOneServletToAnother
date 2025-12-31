package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Hr;

public class HrBookDao {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("project");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();

	private HrBookDao() {}
	
	private static HrBookDao hrBookDao;

	
	
	public static HrBookDao getHrBookDao() {
		if (hrBookDao == null) {
			hrBookDao = new HrBookDao();
		}
		return hrBookDao;
	}

	public void saveHr(Hr hr) {
		entityTransaction.begin();
		entityManager.persist(hr);
		entityTransaction.commit();
	}

	public void updateHr(Hr hr) {
		entityTransaction.begin();
		entityManager.merge(hr);
		entityTransaction.commit();
	}
}
