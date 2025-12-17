package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>email "+email+" : Passsword "+password+" : Name "+name+"</h1>");
		
	}
}
