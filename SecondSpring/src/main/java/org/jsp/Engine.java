package org.jsp;

public class Engine {
	private int cc;
	private String brandName;
	private int milage;

	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", brandName=" + brandName + ", milage=" + milage + "]";
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

}
