package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile")
public class Profile extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		String email = (String) session.getAttribute("email");
		String password = (String) session.getAttribute("password");
		String name = (String) session.getAttribute("name");
		long number =(Long)session.getAttribute("number");
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='update' method='post'>");
		out.println("<input type='email' value=" + email + " name='email' hidden>");
		
		out.println("<br>");
		out.println("Password : <input type='password' value=" + password + " name='password'>");
		out.println("<br>");
		out.println("Name : <input type='text' value=" + name + " name='name'>");
		out.println("<br>");
		out.println("Number : <input type='tel' value=" + number + " name='number'>");
		out.println("<br>");
		out.println("<button>Update</button>");
		out.println("<br>");
		out.println("</form>");
		out.println("<form action='delete' method='post'>");
		out.println("<button>Delete</button>");	
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
