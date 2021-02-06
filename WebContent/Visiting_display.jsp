<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Visiting detils</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
   background-color: transparent;
}

li {
background-color: transparent;
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
 color:lightgrey;
}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: white;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: grey;
}

.dropdown:hover .dropdown-content {
  display: block;
  
}
.dropdown:hover {
  background-color: black;
}
.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: transparent;
  font-family: inherit;
  margin: 0;
}body{

 background-image:url(images/homeingedit.jpg);
 background-repeat: no-repeat;
 background-size:  130% ;
}
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */


/* Set a style for all buttons */

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  border-radius: 12px;
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
  border-radius: 15px;
}

span.psw {
  float: right;
  padding-top: 16px;
}


/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
background-image:url(images/bg-01.jpg);
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 60%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
.crt{
float: right;
}
 .hide {
	display: none;
}

.show {
	display: block;
}

.product{
	margin-bottom: 50px;
	margin-left: 50px;
	margin-right: 50px;
}

.row{
	display: flex;
}


</style>
<link rel="stylesheet" href="Footer.css">
</head>
<body>

   <form method="get" action="LogOut_servelet">
<button type="submit"  style="float: right;
  width: 100px;
  border: 3px solid #73AD21;
  padding: 10px;" >LOGOUT</button>
</form>
<ul>
 <li><a  style="background-color: grey;" href="Customer_Dashboard.jsp">Dashboard</a></li>
   <li> <div class="dropdown">
   <button class="dropbtn">Advertiesment</button>
  <div class="dropdown-content">
    <a href="">Event</a>
    <a href="">Discount</a>
   
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">Online_Store</button>
  <div class="dropdown-content">
    <a href="DisplayHouseHoldFurnitures.jsp">Household Furniture</a>
    <a href="DisplayHotelFurniture.jsp">Hotel Furniture</a>
    <a href="DisplayOfficeFurnitures.jsp">Office Furniture</a>
  </div>
</div></li>
  <li><a href="pastProjectRetrive.jsp">Company_Projects</a></li>
  <li><a href="OwnerRetriew.jsp">Owner_Profile</a></li>
   
<li><a href="cartCutomerRetrive.jsp">
<img src="images/empty_cart.png"  width="25%" ><div class="crt">Your_cart</div></a></li>
      
<li><a href="CustomerRetrieve.jsp">Your_Profile</div></a></li>
    
   
</ul>
<br><br><br>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Db.Db_connection"%>


<%
Connection connection;
 
PreparedStatement preparedStatement;




	
 ResultSet res ;
%>



<center><h1 style = "color:white;">Visite Details</h1></center>
	
<%
try{ 
connection = Db_connection.getConnection();


String  sql1= "select * from visite where CustomerID=?"; 

preparedStatement =connection.prepareStatement(sql1);


preparedStatement.setInt(1,(Integer)session.getAttribute("UID"));

res  = preparedStatement.executeQuery();


while (res.next()) {

%>		

<div class="product">
<center>
<div class="container" style="background-color:black; width:40%; height:30%;">
<table>
<center>
	<tr>
		<td><h3 style="color:white;"><%="Name = " + res.getString("Name")%></h3></td>
	</tr>
	<tr>
		<td><h3 style="color:white;"><%="NIC = "+ res.getString("NIC")%></h3></td>
	</tr>
	<tr>
		<td><h3 style="color:white;"><%="Email = " + res.getString("Email")%></h3></td>
	</tr>
	<tr>
		<td><h3 style="color:white;"><%="Mobile = " + res.getString("Phone")%></h3></td>
	</tr>
	<tr>
		<td><h3 style="color:white;"><%="Address = " + res.getString("Address") %></h3></td>
	</tr>
	
	<tr>
		<td><h3 style="color:white;"><%="Massage = " + res.getString("Messege")%></h3></td>
	</tr>

	<tr>
		<td><form action="Visit_pre_updated" method="POST">
				
				
					
					
						<input name="visiteId" step="1" hidden type = "number" id = "visiteId" value="<%=res.getString("visite_id")%>" >
						<input name="fullname" type = "text" hidden id = "fname" placeholder = "Your Name" value="<%=res.getString("Name")%>" required>				
						<input name="NIC" type = "text" hidden  id = "NIC" placeholder = "Your NIC" value="<%=res.getString("NIC")%>"  required>	
	<input name="Email" type = "email" hidden id = "email" placeholder = "Your Email" value="<%=res.getString("Email")%>" required>					
<input name="pNum" type = "phone" hidden id = "mNo" placeholder = "Your Phone Number" value="<%=res.getString("Phone")%>" required>
  <input name="adres" type = "text" hidden id = "adress" placeholder = "Enter the Address" value="<%=res.getString("Address") %>" required>	
<input name="message" type = "text" hidden id = "message" placeholder = "Messege" value="<%=res.getString("Messege")%>" required>	
<button type="submit">UPDATE</button>
</form>


<form action="deleteVisite" method="POST">
<input name="visiteId" step="1" type = "number" hidden id = "visiteId" value="<%=res.getString("visite_id")%>">
	<button type="submit">DELETE</button>
	</form>
	
	</td>
	</tr>
	</center>
			</table>
		</div>
		</center>
</div>

<% 
}
connection.close();

} catch (Exception e) {
e.printStackTrace();
}
%>
</div>
	</div>
<br><br><br><br><br><br><br><br><br><br><br><br>


<div class="footer">
  <div class="inner-footer">

<!--  for company name and description -->
    <div class="footer-items">
      <h2 style="font-style:italic;color:#D1A700">Maduranga & Mandinu FURNITURES </h1>
       <h3 style="font-style:italic;">We are the largest one-stop<br> shop for<br> total customized interior<br> solutions and<br> furniture requirements in Sri-Lanka for <br>all corporate and residential interior<br> needs.</h3>
    </div>

<!--  for quick links  -->
    <div class="footer-items">
      <h3>Quick Links</h3>
      <div class="border1"></div><br> <!--for the underline -->
        <ul>
          <a href="#"><li style="color:white;">Home</li></a><br><br>
          <a href="#"><li style="color:white;">Online Store</li></a><br><br>
          <a href="#"><li style="color:white;">Company Projects</li></a><br><br>
          <a href="#"><li style="color:white;">Advertiesments</li></a><br><br>
        </ul>
    </div>

<!--  for some other links -->
    <div class="footer-items">
      <h3>Selling Catogories</h3>
      <div class="border1"></div><br>  <!--for the underline -->
        <ul>
          <a href="#"><li style="color:white;">Hotel Furnitures</li></a><br><br>
          <a href="#"><li style="color:white;">House Hold Furnitures</li></a><br><br>
          <a href="#"><li style="color:white;">Office Furniture</li></a><br><br>
          <a href="#"><li style="color:white;">Wooden & Decking</li></a><br><br>
        </ul>
    </div>

<!--  for contact us info -->
    <div class="footer-items">
      <h3>Contact us</h3>
      <div class="border1"></div><br>
        <ul>
          <li><i class="fa fa-map-marker" aria-hidden="true"></i><b>Address:</b><br>191/5A, Silverin Park ,Maharekma Road,<br> Mawala, Wadduwa </li><br><br>
          <br><br><br><li><i class="fa fa-phone" aria-hidden="true"></i><b>Tel:</b> 0773057016-0763163972</li><br><br>
          <li><i class="fa fa-envelope" aria-hidden="true"></i><b>E-mail:</b> madhurangakldc@gmail.com </li><br><br>
        </ul> 
      
<!--   for social links -->
        <div class="social-media">
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="#"><i class="fab fa-facebook"></i></a>
          <a href="#"><i class="fab fa-google-plus-square"></i></a>
        </div> 
    </div>
  </div>
  
<!--   Footer Bottom start  -->
  <div class="footer-bottom">
    All right recerved
  </div>
</div>


</body>
</html>