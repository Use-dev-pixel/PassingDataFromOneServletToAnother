package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bike.xml");
		Bike bike=(Bike)context.getBean("bike1");
		System.out.println(bike);
	}
}
