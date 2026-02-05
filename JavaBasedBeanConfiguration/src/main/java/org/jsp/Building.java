package org.jsp;

public class Building {
	String buildingName;
	int noOfFloors;
	int noOfFlats;
	boolean lift;

	public Building(String buildingName, int noOfFloors, int noOfFlats, boolean lift) {
		super();
		this.buildingName = buildingName;
		this.noOfFloors = noOfFloors;
		this.noOfFlats = noOfFlats;
		this.lift = lift;
	}

	@Override
	public String toString() {
		return "Building [buildingName=" + buildingName + ", noOfFloors=" + noOfFloors + ", noOfFlats=" + noOfFlats
				+ ", lift=" + lift + "]";
	}

}
