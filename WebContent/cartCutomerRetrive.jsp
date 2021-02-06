<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

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
}
body{

 background-image:url(images/homeingedit.jpg);
 background-repeat: no-repeat;
 background-size:  130%;


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






.search{

float: right;
 
  border: 3px  ; 
  padding: 10px;

}
.sBot{
float: right;
   width: 200px;
 

}


.container {
  padding: 20px;
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
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
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
.se{

float: right;
 
  border: 3px  ; 
  padding: 10px;
  background-color: transparent;

}

</style>

<body>

    <form method="get" action="LogOut_servelet">
<button type="submit"  style="float: right;
  width: 100px;
  border: 3px solid #73AD21;
  padding: 10px;" >Logout</button>
</form>


<ul>
  <li><a  style="background-color: grey;" href="">Home</a></li>
   <li>  <div class="dropdown">
   <button class="dropbtn">Create_Ad</button>
  <div class="dropdown-content">
    <a href="">Event</a>
    <a href="">Discount</a>
   
  </div>
</div></li>
<li><a href="">Owner_profile</a></li>
  <li><div class="dropdown">
  <button class="dropbtn">Online_Store</button>
  <div class="dropdown-content">
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">Pricing_Properties</button>
  <div class="dropdown-content">
   <a href="Pricing_Properties.jsp">Entering properties</a>
    <a href="HouseHoldFurniturePropeties.jsp">Household Furniture properties</a>
    <a href="HotelFurnitureProperties.jsp">Hotel Furniture properties</a>
    <a href="Office_Furniture_properties.jsp">Office Furniture properties</a>
    <a href="Sofasetes_properties.jsp">Sofasetes Furniture properties</a>
    <a href="Pantey_and_kitchen.jsp">Pantry&Kitchen Furniture properties</a>
    <a href="WoodenDecking_and_timber_floring.jsp">Wooden&Decking Furniture properties</a>
  </div>
</div></li>
  <li><a href="">Feebacks</a></li>
   <li><div class="dropdown">
   <button class="dropbtn">Post_Projects</button>
   <div class="dropdown-content">
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
</div></li>

<li><div class="search"><form method="post" action="searchcart"><input type="search" name="search" placeholder="Search.." ><input type="submit" value="search"></form></div>
</form></div></li>

</ul>
<br><br><br><br><br><br><br><br>



<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Db.Db_connection"%>

<%
Connection connection;
 
PreparedStatement preparedStatement;

	
 ResultSet res;
%>
<center>

<br><br><br>
</center>




<center>

<div class="container" style="background-color:#f1f1f1; width:50% ;length:50%;">
<h2 style="color:black;">Welcome to your cart !</h2>
<table   class="table table-bordered table-bordered-custom" align="center" cellpadding="5"  border="0">

<tr bgcolor="white">


<th><b>Price</b></th>
<th><b>Colours</b></th>
<th><b>Quantity</b></th>





</tr>
<%
try{ 
connection = Db_connection.getConnection();


String  sql1= "select * from shopping_cart where Cus_ID = ?";

preparedStatement =connection.prepareStatement(sql1);


preparedStatement.setInt(1,(Integer)session.getAttribute("UID"));

res  = preparedStatement.executeQuery();

while(res.next()){

%>

<tr bgcolor="#A2D9CE">


<td><%=res.getDouble("Price") %></td>
<td><%=res.getString("colours") %></td>
<td><%=res.getInt("quantity") %></td>

<td>

  <center>
  <form  action="UPDATE_cart" method="post">
    
    
  
      <br><input type="number" step ="0.01" name="Price"  value="<%=res.getDouble("Price") %>"  required>

     
      <br><input type="text" name="Colours" value="<%=res.getString("colours") %>" required>
                        
    
      <br><input type="number" step ="1" name="Quantity"  value="<%=res.getInt("quantity") %>" required>  
      
                      
       <br><input type="number" step ="1 " hidden name = "cusID" value="<%=res.getInt("Cus_ID") %>" required>
      
      <br><input type="number" step ="1 " hidden  name = "CartID" value="<%=res.getInt("Cart_ID") %>" required>
      <input type="number" step="1"  hidden required name="validate" value="2">
        
      <td><button type="submit">Update</button></td>
      
   

   
  </form>

</center>
                        
 <form method="post" action="DELETE_cart" >
<input type="number" step="1"  hidden required name="cartid" value="<%=res.getInt("Cart_ID") %>">
<input type="number" step="1"  hidden required name="validate" value="2">

<td> <button type="submit">Delete</button></td>
</form>


</td>


</tr>

<% 

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>

</table>


<center>
<form action="cart_Calculate_servelet_M" method="post">
 <h2 style= "color:black";>Do you want Company Transport ?</h2></style>
YES<input type= "radio" name="valuesc" value="Yes">
NO<input type= "radio" name="valuesc" value="No">
<br><br>
<button type="submit" style="color:background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 30%;
 border-radius: 12px;">Send</button>

</form>
</center>
 </div>
 </center>


</center>

</body>
</html>