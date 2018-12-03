<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String msg = request.getParameter("emsg");
if(msg==null){
	msg="";
}
%>
<b style="color:red"><%= msg %></b>
<form action="register" method="post">
    <input type="text" name="user" placeholder="Enter Username">
    <input type="password" name="pwd" placeholder="Enter Password">
    <input type="email" name="mail" placeholder="Enter Mail">
    <input type="text" name="phone" placeholder="Enter Mobile Number">
    <button type="submit">Submit</button>
</form>
</body>
</html>