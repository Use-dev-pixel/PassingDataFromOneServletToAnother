package org.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BikeDriver {
//	public static void main(String[] args) {
//		Bike bike = new Bike(); 
//		bike.startBike();
//		bike.stopBike();
//	}

	
	
//	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("bike.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		
//		System.out.println(beanFactory.getBean("donkey1"));  
//	}
	
	
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bike.xml");
		Bike bike=(Bike)context.getBean("donkey1");
		bike.startBike();
		bike.stopBike();
	}
}
