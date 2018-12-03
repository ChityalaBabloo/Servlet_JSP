<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="com.cg.jsp.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<!-- * indicates all properties.e is an instance and setting those values to e 
if bean class instance variable names and our emp_bean_employee.jsp have same names we will use *
if they are different we use 
<jsp:setProperty property="id" name="e" param="eid"></jsp:setProperty>
here property="id" bean class name attribute
here param="eid" is bean class instance variable
-->
<h1>You Entered: </h1><br>
Id: <jsp:getProperty property="id" name="e"/>
Name: <jsp:getProperty property="name" name="e"/>
salary: <jsp:getProperty property="salary" name="e"/>
</body>
</html>