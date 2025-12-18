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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		HttpSession session=request.getSession();
		PrintWriter out = response.getWriter(); 

		String email =(String) session.getAttribute("email");
		String password =(String) session.getAttribute("password");
		String name =(String) session.getAttribute("name");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/httpservlet_project",
					"root", "rootroot");
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user WHERE email=?");
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				out.println("<form action='test'>");
				out.println("<input type='email' value="+email+" name='email'>");
				out.println("<br>");
				out.println("<input type='password' value="+password+" name='password'>");
				out.println("<br>");
				out.println("<input type='text' value="+name+" name='name'>");
				out.println("<br>");
				out.println("<button>Update</button>");
				out.println("<br>");
				out.println("</form>");
			}else {
				out.println("<h1>No User found contact developer</h1>");
			}
			

		} catch (Exception e) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
			out.println("<h1>Database Error please contact Developara</h1>");
			dispatcher.include(request, response);

		}
	}
}
