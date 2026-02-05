package org.jsp;

public class Bike {
	String brandName;
	String type;
	String fuelType;
	int noOfWheels;
	String color;
	double cost;
	Engine engine;

	public Bike(String brandName, String type, String fuelType, 
			int noOfWheels, String color, double cost,
			Engine engine) {
		super();
		this.brandName = brandName;
		this.type = type;
		this.fuelType = fuelType;
		this.noOfWheels = noOfWheels;
		this.color = color;
		this.cost = cost;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Bike [brandName=" + brandName + ", type=" + type + ", fuelType=" + fuelType + ", noOfWheels="
				+ noOfWheels + ", color=" + color + ", cost=" + cost + ", engine=" + engine + "]";
	}

	public void startBike() {
		System.out.println("started...");
	}

	public void stopBike() {
		System.out.println("stopped...");
	}
}
