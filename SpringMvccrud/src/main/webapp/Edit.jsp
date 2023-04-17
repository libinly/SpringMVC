<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.demo.Test1.DTO.RegistrationDTO.StudentDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
StudentDTO fromdb=(StudentDTO)session.getAttribute("Student");
%>
<h1>Update Details</h1>
<form action="update.do" method="post">
Student Id: <input type="number" name="sid" value="<%fromdb.getSid(); %>"disable="disabrled"><br>

Student name:<input type="text" name="sname" value="<%fromdb.getSname(); %>"><br>
Student Address:<input type="text" name="sadd" value="<%fromdb.getSadd(); %>"><br>
Course:<select name="course">
<option><%fromdb.getCourse(); %></option>
<option value="Btech">Btech</option>
<option value="Mtech">Mtech</option>
<option value="BBA">BBA</option>
<option value="BCA">BCA</option>
</select>
Place:<input type="text" name="splace" value="<%fromdb.getSplace();%> "><br>
Age:<input type="text" name="sage" value=" "><br>
Email id:<input type="text" name="sname" value=""><br>
Password:<input type="password" name="pwd"><br>

<input type="submit" value="update">

</form>

</body>
</html>