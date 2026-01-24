package org.jsp.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Attendance;
import org.jsp.dto.AttendanceId;

public class AttendanceController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compositekey");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		AttendanceId attendanceId = new AttendanceId();
		attendanceId.setEmpId(101);
		attendanceId.setLocation("PUNE010");
		attendanceId.setDate(LocalDate.now());

		Attendance attendance = new Attendance();
		attendance.setId(attendanceId);
		attendance.setStatus("Present");

		entityTransaction.begin();
		entityManager.persist(attendance);
		entityTransaction.commit();

	}
}
