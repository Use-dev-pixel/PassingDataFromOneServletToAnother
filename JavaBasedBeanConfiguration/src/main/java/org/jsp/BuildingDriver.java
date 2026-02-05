package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BuildingDriver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Building building=context.getBean(Building.class);
		Building building1 = (Building) context.getBean("getBuilding1");
		System.out.println(building1);
		Building building2 = (Building) context.getBean("getBuilding2");
		System.out.println(building2);
	}
}
