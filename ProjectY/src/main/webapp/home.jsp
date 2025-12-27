<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Hello.......<%= session.getAttribute("name") %></h3>
<a href="test"><button>Logout</button> </a>
<br>
<a href="test"><button>Profile</button> </a>
<br>
<a href="test"><button>Add Student</button> </a>
<br>
<a href="deletebyid.html"><button>Delete Student By ID</button> </a>
<br>
<a href="test"><button>Find Student By Id</button> </a>
<br>
<a href="test"><button>Find Student By Name</button> </a>
<br>
<a href="test"><button>Update Student By Email</button> </a>
<br>
<a href="displayall.jsp"><button>Display All Students</button> </a>
<br>
</body>
</html>