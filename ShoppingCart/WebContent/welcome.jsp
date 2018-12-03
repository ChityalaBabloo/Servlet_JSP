<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='mediumseagreen'>
<h1><center>Welcome</center></h1><br>
<p>Welcome Mr. <%=session.getAttribute("uname") %></p>
<%
Cookie c[]=request.getCookies();
if(c!=null) {
	for(int i =0; i<c.length;i++) {
%>
<%=c[i].getValue() %>
<%
	}
}
%>
</body>
</html>