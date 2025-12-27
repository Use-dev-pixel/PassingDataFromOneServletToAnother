<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	String user = "root";
	String password = "rootroot";
	String url = "jdbc:mysql://localhost:3306/projecty";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, user, password);
	PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
	ResultSet set = preparedStatement.executeQuery();
	if (set.next()) {
		
		do{
		%>
			<h4>Id : <%= set.getInt("id") %>
			Name : <%= set.getString("name") %>
			Email : <%= set.getString("email") %>
			Password : <%= set.getString("password") %>
			Number : <%= set.getLong("number") %>
			<a href="delete.jsp?redirect=displayall&id=<%=set.getInt("id") %>"> <button>Delete</button> </a>
			<a href="update.jsp"> <button>Update</button> </a>
			</h4>
		<%
		}while(set.next());
	} else {
	%>
		<h1>No Records Found</h1>	
	<%
	}
	%>

</body>
</html>