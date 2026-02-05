package org.jsp;

public class Cat {
	String name;
	int noOfLegs;
	boolean tail;
	String furQuality;
	String breed;

	@Override
	public String toString() {
		return "Cat [name=" + name + ", noOfLegs=" + noOfLegs + ", tail=" + tail + ", furQuality=" + furQuality
				+ ", breed=" + breed + "]";
	}

	public Cat(String name, int noOfLegs, boolean tail, String furQuality, String breed) {
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.tail = tail;
		this.furQuality = furQuality;
		this.breed = breed;
	}

}
