 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.demo.Test1.DTO.RegistrationDTO.StudentDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to manchester</h1>
<a href="Login.jsp">Please Login</a>
<%
	StudentDTO fromdb=(StudentDTO)session.getAttribute("student");
	int sid=fromdb.getSid();
%>
<br>
<a href="Edit.jsp?id=<%=sid %>">Edit Your Details </a>



</body>
</html>