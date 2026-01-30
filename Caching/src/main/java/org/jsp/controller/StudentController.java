package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

//For persistence.xml
//https://shorturl.at/iNLbS


//For dependency
//https://shorturl.at/oVcsX

public class StudentController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("cache");
		
		
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		System.out.println(entityManager1.find(Student.class, 1));
		System.out.println(entityManager1.find(Student.class, 2));
		System.out.println(entityManager1.find(Student.class, 2));
		
		
		
		EntityManager entityManager2=entityManagerFactory.createEntityManager();
		System.out.println(entityManager2.find(Student.class, 1));
		System.out.println(entityManager2.find(Student.class, 2));
		System.out.println(entityManager2.find(Student.class, 2));
	}
}
