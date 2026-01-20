package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.StudentBatchDao;
import org.jsp.dto.Batch;
import org.jsp.dto.Student;

public class StudentBatchController {
//	public static void main(String[] args) {
//		StudentBatchDao dao=new StudentBatchDao();
//		
//		
//		Batch batch1=new Batch();
//		batch1.setBid(101);
//		batch1.setSubjectName("Java");
//		batch1.setDate("26-01-2026");
//		batch1.setTime("2pm to 4pm");
//		batch1.setTrainerName("Pavan");
//		
//		
//		Batch batch2=new Batch();
//		batch2.setBid(102);
//		batch2.setSubjectName("SQL");
//		batch2.setDate("24-09-2025");
//		batch2.setTime("7:30AM to 9:30AM");
//		batch2.setTrainerName("Dinesh");
//		
//		
//		Batch batch3=new Batch();
//		batch3.setBid(103);
//		batch3.setSubjectName("WebTech");
//		batch3.setDate("17-10-2025");
//		batch3.setTime("2pm to 4pm");
//		batch3.setTrainerName("Nikhil");
//		
//		List<Batch> batches=new ArrayList<Batch>();
//		batches.add(batch1);
//		batches.add(batch2);
//		batches.add(batch3);
//		
//		
//		
//		Student student1=new Student();
//		student1.setSid(1);
//		student1.setName("Aman");
//		student1.setEmail("aman@donkey.com");
//		student1.setPassword("Don@Key12345");
//		student1.setAddress("Gutta");
//		student1.setNumber(8932756399L);
//		student1.setBatches(batches);
//		
//		
//		
//		Student student2=new Student();
//		student2.setSid(2);
//		student2.setName("Superja");
//		student2.setEmail("super@donkey.com");
//		student2.setPassword("Ja12345Super");
//		student2.setAddress("ECIL");
//		student2.setNumber(1234556399L);
//		student2.setBatches(batches);
//		
//		
//		dao.saveStudent(student1);
//		dao.saveStudent(student2);
//	}
	
	
	public static void main(String[] args) {
		StudentBatchDao dao=new StudentBatchDao();
		
		List<Batch> batches=new ArrayList<Batch>();
		
		Student student1=new Student();
		student1.setSid(3);
		student1.setName("Ram");
		student1.setEmail("Ram@gmail.com");
		student1.setPassword("Ram@45");
		student1.setAddress("JNTU");
		student1.setNumber(8932777669L);
		student1.setBatches(batches);
		
		dao.addStudentInBatch(student1, 101);
		
	}
}
