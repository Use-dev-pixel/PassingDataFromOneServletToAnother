package org.jsp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
public class Cat {
	String name="cat";
	
	
	
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("hello");
	}
	@PreDestroy
	public void stop() {
		System.out.println("bye");
	}
}
