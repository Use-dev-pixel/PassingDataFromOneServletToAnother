package org.jsp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/test" , loadOnStartup = 1)
public class MyServlet extends GenericServlet {
	
	public MyServlet() {
		System.out.println("this is instantiation phase");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("this is init() phase");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("this is service() phase");
	}

	@Override
	public void destroy() {
		System.out.println("this is destroy() phase");
	}

}
