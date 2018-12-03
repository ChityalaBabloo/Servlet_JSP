<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.1.0/css/all.css">
    <link rel="stylesheet" href="css/home.css">
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Home | CapStopre</title>
	<link rel="icon" href="images/cart1.png">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="slider.jsp"></jsp:include>
    <div class="container text-center"> 
        <h3 class="section-a">Mobiles</h3>
        <div class="row">
            <div class="col-sm-3">
                <a href="second.jsp?id=1" target="_blank"><img src="images/realme-2.jpeg" alt="realme-2"></a>
                <h4>Realme 2</h4>
                <p>$300</p>
            </div>
            <div class="col-sm-3">
                <a href="second.jsp?id=2"><img src="images/vivo-v11.jpeg" alt="vivo-v11"></a>
                <h4>Vivo-v11</h4>
                <p>$1300</p>
            </div>
            <div class="col-sm-3"> 
                <a href="second.jsp?id=3"><img src="images/lg-q-stylus.jpeg" alt="lg-q-stylus"></a>
                <h4>LG Q Stylus</h4>
                <p>$3000</p>
            </div>
            <div class="col-sm-3"> 
                <a href="second.jsp?id=4"><img src="images/yu-ace.jpeg" alt="yu-ace-5014"></a>
                <h4>Yu Ace</h4>
                <p>₹8,990</p>
            </div>
        </div><hr><br>
        <div class="row">
            <div class="col-sm-4">
                <a href="second.jsp?id=5"><img src="images/nokia-8-sirocco.jpeg" alt="realme-2"></a>
                <h4>Nokia 8 Sirocco</h4>
                <p>$3000</p>
            </div>
            <div class="col-sm-4">
                <a href="second.jsp?id=6"><img src="images/galaxy-s9-plus.jpeg" alt="realme-2"></a>
                <h4>Galaxy S9 Plus</h4>
                <p>$300</p>
            </div>
            <div class="col-sm-4">
                <a href="second.jsp?id=7"><img src="images/Note-8.jpeg" alt="realme-2"></a>
                <h4>Galaxy Note 8</h4>
                <p>$300</p>
            </div>
        </div><hr><br>
        <div class="row">
            <div class="col-sm-3">
                <a href="second.jsp?id=1"><img src="images/realme-2.jpeg" alt="realme-2"></a>
                <h4>Realme 2</h4>
                <p>$300</p>
            </div>
            <div class="col-sm-3">
                <a href="second.jsp?id=2"><img src="images/vivo-v9-youth-1727.jpeg" alt="vivo-v11"></a>
                <h4>Vivo-9-Youth</h4>
                <p>$1300</p>
            </div>
            <div class="col-sm-3"> 
                <a href="second.jsp?id=3"><img src="images/lg-q-stylus.jpeg" alt="lg-q-stylus"></a>
                <h4>LG Q Stylus</h4>
                <p>$3000</p>
            </div>
            <div class="col-sm-3"> 
                <a href="second.jsp?id=4"><img src="images/yu-ace.jpeg" alt="yu-ace-5014"></a>
                <h4>Yu Ace</h4>
                <p>₹8,990</p>
            </div>
        </div>
    </div>
<div class="container-fluid bg-grey" id="contact">
  <h2 class="text-center">CONTACT</h2><br>
  <div class="row">
    <div class="col-sm-5">
      <p>Contact us :</p>
      <p>CapStore Private Ltd,</p>
      <p>Ground Floor, SB1 Block,</p>
	  <p>115/32 & 35, ISB Rd, Financial District,</p>
	  <p>Nanakram Guda, Hyderabad, Telangana 500032</p>
      <p style="color:aqua"><i class="fas fa-envelope"></i> myemail@something.com</p> 
    </div>
    <form class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5" required></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div> 
    </form>
  </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>