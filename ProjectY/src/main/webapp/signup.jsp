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
		String name=request.getParameter("name");
		
		long number=Long.parseLong(request.getParameter("number"));
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projecty","root","rootroot");
		
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO hr VALUES(?,?,?,?)");
		
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, password);
		preparedStatement.setLong(4, number);
		
		int result=preparedStatement.executeUpdate();
		if(result==1){
			response.sendRedirect("login.html");
		}else{
			RequestDispatcher dispatcher=request.getRequestDispatcher("signup.html");
			out.println("<h1> Contact Developer</h1>");
		}
	
	%>
</body>
</html>