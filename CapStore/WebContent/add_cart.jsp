<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.1.0/css/all.css">
	<link rel="stylesheet" href="css/add_cart.css">
	<link rel="stylesheet" href="css/header.css">
	<link rel="stylesheet" href="css/footer.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<title>Cart | CapStopre</title>
	<link rel="icon" href="images/cart1.png">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br>
	<%
		String msg = request.getParameter("msg");
		if (msg == null) {
			msg = "";
		}
	%><br><br>
	<b style="color:green"><%=msg %></b>
	<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pass = "Capgemini123";
		Connection con = DriverManager.getConnection(url, user, pass);

		//Displaying last added Cart Product
		String query1 = "Select max(slno) from cart";
		PreparedStatement ps2 = con.prepareStatement(query1);
		ResultSet rs2 = ps2.executeQuery();
		rs2.next();

		String query2 = "select * from cart where slno = ?";
		PreparedStatement ps3 = con.prepareStatement(query2);
		ps3.setInt(1, rs2.getInt(1));
		ResultSet display = ps3.executeQuery();
		display.next();
	%>
	<div class="pos">
		<img src="images/<%=display.getString(8)%>"
			alt="<%=display.getString(8)%>" width="80px" height="150px">
		<p><%=display.getString(3)%> <%=display.getString(4)%><br>$<%=display.getString(5)%></p>
	</div>
</body>
</html>