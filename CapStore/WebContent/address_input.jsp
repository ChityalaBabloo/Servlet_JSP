<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Address | CapStore</title>
<link rel="icon" href="images/cart1.png">
</head>
<style>#con {display:none}</style>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
String pid = request.getParameter("id");
%>
<br><br>
<div class="container">
  <form class="form-inline" action="Buy">
  <input type="hidden" name="id" value=<%=pid%>><br>
    <div class="form-group">
      <textarea type="text" class="form-control" name="Address" rows="5" cols="50" placeholder="Enter Address" required></textarea>
    </div><br><br>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
</body>
</html>