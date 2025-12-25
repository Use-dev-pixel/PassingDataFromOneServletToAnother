<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="login.jsp">
		<h5><%String error=(String)session.getAttribute("error");
			if(error!=null)out.println(error);
		%></h5>
		<label>Email</label>
		<input type="email" value="example@gmail.com" name="email">
		<br>
		<label>Password</label>
		<input type="password" value="example@12345" name="password">
		<br>
		<button>Login</button>
		<h4>Dont Have an Account Signup <a href="signup.html" >Click Here</a></h4>
	</form>

</body>
</html>