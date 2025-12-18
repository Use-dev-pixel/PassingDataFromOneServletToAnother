package org.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		System.out.println(email);
		System.out.println(password);
		String name="rajkumari";
		
		
		HttpSession session=req.getSession();
		
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		session.setAttribute("name", name);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("servlet2");
		dispatcher.forward(req, resp);

		
	}
}
