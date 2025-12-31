<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JspComment --%>
	<!-- Html Comment --> 
	//  /* */ JAVA COMMENT



	<!-- Declaration Tag -->
	<%!
	int a=0;//instance variable
	//class|static method
	public static String isPrime(int num) {

		for(int i=2;i*i<=num;i++){
			if(num%i==0)
				return num+" Not a Prime Number";
		}
		return num + " is a Prime Number";
	}%>
	<!--  scriptlet tag-->
	<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	int num=Integer.parseInt(request.getParameter("num"));
	System.out.println(email);
	System.out.println(password);

	
	config.getServletName();
	application.getInitParameter("Name");
	pageContext.getRequest();
	
	exception.getMessage();
	System.out.println(page);
	//<%=this%>
	
	
	out.println("<h1>"+email+"</h1>");
	%>
	<!-- Expression tag -->
	<h1><%=email%></h1>
	<%=password%>
	
	<h1><%= isPrime(num) %></h1>
</body>
</html>