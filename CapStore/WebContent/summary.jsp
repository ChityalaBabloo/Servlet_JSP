<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Refresh" content="10;url=home.jsp">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/second.css">
	<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.1.0/css/all.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<title>Summary | CapStopre</title>
	<link rel="icon" href="images/cart1.png">
</head>
<body>

<%
	String orderId = request.getParameter("orderId");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "system";
	String pass = "Capgemini123";
	Connection con = DriverManager.getConnection(url, user, pass);
	String sql = "select * from buy where orderId=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, orderId);
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
%>
	<div class="container">
		<div class="left text-center">
			<img src="images/<%=rs.getString(6)%>" alt="<%=rs.getString(6)%>">
		</div>
	</div>
	<div class="right">
		<h3><%=rs.getString(3) %> <%=rs.getString(4) %></h3>
		<p style="text-transform:capitalize;color:green">Your Order Has Been Placed To : <%=rs.getString(7) %></p>
	</div><br>
	<p>Page Automatically Redirects To Home Page in 10 seconds</p>
	<% }%>
</body>
</html>