<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student details</h1>
<form action="register.do" method="post">
Student name    <input type="text" name="sname"><br>
<br>
Student Address <input type="text" name="sadd"><br>
<br>
Course:<select name="course"> 
<option value="Btech">Btech</option>
<option value="Mtech">Mtech</option>
<option value="BBA">BBA</option>
<option value="BCA">BCA</option>
</select> <br>
<br>
Place          <input type="text" name="splace"><br>
<br>
Age            <input type="text" name="sage"><br>
<br>
Email       <input type="email" name="semail"><br>
<br>
Password   <input type="password" name="spwd"><br>
<br>

<input type="submit" value="Submit">

</form>

</body>
</html>