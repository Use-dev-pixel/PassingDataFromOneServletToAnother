<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
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
<%
int id =Integer.parseInt(request.getParameter("id"));
	String user = "root";
	String password = "rootroot";
	String url = "jdbc:mysql://localhost:3306/projecty";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, user, password);
	PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student WHERE id=?");
	preparedStatement.setInt(1, id);
	
	
	preparedStatement.executeUpdate();
	String redirect=request.getParameter("redirect");
	
	if(redirect.equals("displayall"))
		response.sendRedirect("displayall.jsp");
	else if(redirect.equals("deletebyid"))
		response.sendRedirect("deletebyid.html");
%>
</body>
</html>