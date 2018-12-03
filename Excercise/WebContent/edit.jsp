<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>

<%
String pid=request.getParameter("id");
%>

<%
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:XE";
String user="system";
String pass="Capgemini123";
Connection con= DriverManager.getConnection(url,user,pass);
String sql="select * from products where pid=?";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,pid);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	%>
	<form action = "update">
	<input type = "text" name = "pid" value ="<%=rs.getString(1) %>"readonly>
	 
	<input type = "text" name = "pname" value = "<%=rs.getString(2) %>"readonly>
	 
	<input type = "text" name = "model" value = "<%=rs.getString(3) %>"readonly>
	 
	<input type = "text" name = "price" value = "<%=rs.getString(4) %>">
	 
	<button type = "submit">Save</button>
	 
	</form>
	 
	<% }%>
</table>
</body>
</html>