package org.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BikeDriver {
//	public static void main(String[] args) {
//		Bike bike = new Bike(); 
//		bike.startBike();
//		bike.stopBike();
//	}

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bike.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		System.out.println(beanFactory.getBean("donkey1"));  
	}
}
