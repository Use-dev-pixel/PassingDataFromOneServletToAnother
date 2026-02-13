package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatDriver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(Cat.class));
		AnnotationConfigApplicationContext ac=(AnnotationConfigApplicationContext)context;
		ac.close();
	}
}
