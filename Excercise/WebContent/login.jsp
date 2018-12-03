<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
	body {
	margin: 0;
	padding: 0;
}
form {
	width: 300px;
	margin: 0 auto;
	border:1px solid black;
	text-align:center;
	padding:25px;
}
a:link {
	text-decoration:none;
}
</style>
</head>
<body>
<%
String msg = request.getParameter("message");
if(msg==null){
	msg="";
}
%>
<b style="color:red"><%=msg %></b>
<h1><center>User Login</center></h1>
<form action="login">
    <input type="text" name="user" placeholder="Enter Username" autofocus><br><br>
    <input type="password" name="pwd" placeholder="Enter Password"><br><br>
    <button type="submit">Submit</button><br><br>
    <a href="forget.jsp" target="_blank">Forgot Password</a><span style="display:inline-block;width:20px"></span>
    <a href="register.jsp" target="_blank">REGISTER</a>
</form>
</body>
</html>