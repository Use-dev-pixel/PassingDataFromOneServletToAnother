package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("cat.xml");
		Cat cat=(Cat)context.getBean("cat1");
		System.out.println(cat);
	}
}
