package org.jsp;

public class CreateBrowser {
	public static Browser getBrowser(String name) {
		switch (name) {
		case "Chrome":
			return new Chrome(); 
		case "MsEdge":
			return new MsEdge(); 
		case "Safari":
			return new Safari(); 
		case "FireFox":
			return new FireFox(); 
		default:
			throw new RuntimeException("No Browser Provider found with "+ name);
		}
	}
}
