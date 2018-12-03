<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table,td,th {
border:1px solid black;
border-collapse:collapse;
padding:10px;
}
</style>
<body>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Model</th>
		<th>Price</th>
		<th colspan="2">Action</th>
	</tr>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:XE";
String user = "system";
String pass = "Capgemini123";
Connection con = DriverManager.getConnection(url, user, pass);
String sql = "select * from products";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
while(rs.next()) {
%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><a href="edit.jsp?id=<%=rs.getString(1) %>">Edit</a></td>
<td><a href="delete.jsp?id=<%=rs.getString(1) %>">Delete</a></td>
</tr>
<% }%>
</body>
</html>
