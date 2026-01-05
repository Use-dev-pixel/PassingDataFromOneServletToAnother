package org.jsp.controller;

import org.jsp.dao.StudentDao;
import org.jsp.dto.Student;

public class StudentController {
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		
		
		Student student = new Student();
		student.setId(5);
		student.setName("Ram");
		student.setEmail("ram@gmail.com");
		student.setPassword("Ram@12345");
		student.setAddress("Hyd");
		
		
		dao.saveStudent(student);
	}
}
