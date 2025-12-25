<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Here We will receive Request  -->
	<%
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projecty","root","rootroot");
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM hr WHERE email=?");
		
		preparedStatement.setString(1, email);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		if(resultSet.next()){
			String dbPassword=resultSet.getString("password");
			if(dbPassword.equals(password)){
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				session.setAttribute("name",resultSet.getString("name"));
				session.setAttribute("number",resultSet.getLong("number"));
				response.sendRedirect("home.jsp");
			}else{
				session.setAttribute("error","Password incorrect");
				response.sendRedirect("log.jsp");
			}
		}else{
				session.setAttribute("error","User Not Found with email");
				response.sendRedirect("log.jsp");
		}
	
	%>
</body>
</html>