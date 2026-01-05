package org.jsp;

public class Driver {
	public static void main(String[] args) {
		Browser browser = CreateBrowser.getBrowser("Opera");
		browser.start();
	}
}
