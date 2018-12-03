<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- The code inside scriplet will placed inside the service method in translation phase.-->
<!-- So. The variables placed declared/ initialized inside the scriplet tag will be local to the service().
*****Similarly, if a method is tried to defined/implemented inside the scriplet tag, we will get compilation
errors because a method inside a method cann't be defined.-->
<!-- Scriplet -->
<%
int a= 10;//a is local to service().so cannt be accessed
out.println("this is scriptlet<br>");
out.println("x: "+x);
%>

<!-- Declarative .The code inside declarative will placed inside the class-->
<!-- So. The variables / methods will be instances.They can be accessed from anywhere -->
<%!
int x = 10;
%>

<br>
<c:set var="id" value="10"></c:set>
<c:out value="${id}"></c:out>
<hr>
<c:forEach var="i" begin="1" end="5">
	<c:out value="${i}"></c:out>
</c:forEach>
<hr>
<%=request.getParameter("msg") %>

</body>
</html>