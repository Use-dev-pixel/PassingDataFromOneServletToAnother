package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile=(Mobile)context.getBean("mobile1");
		System.out.println(mobile);
	}
}
