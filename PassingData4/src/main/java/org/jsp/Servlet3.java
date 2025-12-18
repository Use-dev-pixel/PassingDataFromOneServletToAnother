package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class Servlet3 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession  session=req.getSession();
		
		
		
		String email=(String)session.getAttribute("email");
		String password=(String)session.getAttribute("password");
		String name=(String)session.getAttribute("name");
		
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>email "+email+" : Passsword "+password+" : Name "+name+"</h1>");
	}
}
