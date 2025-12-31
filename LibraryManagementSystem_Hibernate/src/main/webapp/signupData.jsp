<%@page import="org.jsp.dao.HrBookDao"%>
<%@page import="org.jsp.dto.Hr"%>
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
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		long number =Long.parseLong(request.getParameter("number"));
		
		Hr hr=new Hr();
		
		hr.setName(name);
		hr.setNumber(number);
		hr.setEmail(email);
		hr.setPassword(password);
		
		
		
		HrBookDao dao=HrBookDao.getHrBookDao();
		
		dao.saveHr(hr);
		
		response.sendRedirect("login.jsp");
		
		
	%>
</body>
</html>