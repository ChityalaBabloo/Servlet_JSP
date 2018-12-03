<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.1.0/css/all.css">
	<link rel="stylesheet" href="css/second.css">
	<link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<title>Second | CapStopre</title>
	<link rel="icon" href="images/cart1.png">
</head>
<body>
	<%
		String pid = request.getParameter("id");
		String msg = request.getParameter("msg");
		if (msg == null) {
			msg = "";
		}
	%>
		<span style="color:red"><%=msg %></span>
	<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pass = "Capgemini123";
		Connection con = DriverManager.getConnection(url, user, pass);
		String sql = "select * from products where productId=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
	%>
	<jsp:include page="header.jsp"></jsp:include><br><br>
	<div class="container">
		<div class="left text-center">
			<img class="zoom" src="images/<%=rs.getString(7)%>" alt="<%=rs.getString(7)%>">
		</div>
		<div class="right">
			<h3><%=rs.getString(2)%>
				<%=rs.getString(3)%></h3>
			<%
				String arr1 = rs.getString(6);
					String[] a = arr1.split(" ");
			%>
			<p style="letter-spacing: 1px; color: green">SPECIFICATIONS</p>
			<ul class="specs">
				<li>RAM : <%=a[0]%></li>
				<li>ROM : <%=a[1]%></li>
				<li>Battery : <%=a[2]%>mAh
				</li>
			</ul>
			<p>
				<b>Product Description</b>
			</p>
			<p>
				The
				<%=rs.getString(2)%>
				<%=rs.getString(3)%>
				Smartphone is here to elevate your experience with its impressive
				FullView Display and crystal clear volume. Adding to this is the
				presence of a 13 MP Rear Camera that lets you capture moments at
				their memorable best.<span class="coll" data-toggle="collapse"
					data-target="#demo"> View More</span>
			</p>
			<p id="demo" class="collapse">
				Powerful Performance for Easy Multitasking.This phone packs in the
				powerful 2.0 GHz Octa-core AI Chip for enhanced performance. It
				comes with
				<%=a[0]%>
				GB of RAM and
				<%=a[1]%>
				GB of internal memory (expandable up to 256 GB).
			</p>
		</div>
		<div class="buttons row"><br>
			<form action="addCart">
				<input type="hidden" name="id" value=<%=pid%>>
				<button class="btn warning col-sm-2">
					<i class="far fa-shopping-cart"></i>ADD TO CART
				</button>
			</form>
			<form action="address_input.jsp">
				<input type="hidden" name="id" value=<%=pid%>>
				<button class="btn success col-sm-2">
					<i class="fab fa-cc-visa"></i>BUY NOW
				</button>
			</form>
		</div>
	</div>
	<%
		}
	%>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>