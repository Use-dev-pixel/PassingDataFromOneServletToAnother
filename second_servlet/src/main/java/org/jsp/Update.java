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
@WebServlet("/update")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		long number = Long.parseLong(request.getParameter("number"));
		
		
		System.out.println(email);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/httpservlet_project",
					"root", "rootroot");
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE user set name=? , password=? , number=? where email=?");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			preparedStatement.setLong(3, number);
			preparedStatement.setString(4, email);
			
			int result=preparedStatement.executeUpdate();
			if (result>0) {
					HttpSession session=request.getSession();
					session.setAttribute("email", email);
					session.setAttribute("password", password);
					session.setAttribute("name", name);
					session.setAttribute("number", number);
					response.sendRedirect("home");
			} 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
