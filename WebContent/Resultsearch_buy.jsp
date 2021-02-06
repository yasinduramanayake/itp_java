<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: white;
}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
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
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
  
}
.dropdown:hover {
  background-color: white;
}
.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: black;
  padding: 14px 16px;
  background-color: transparent;
  font-family: inherit;
  margin: 0;
}
body{

 background-image:  url(images/IMG-20200908-WA0002.jpg);

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
 
}

button:hover {
  opacity: 0.8;
}

</style>
<title>Searching result</title>
</head>
<body>

<br><br><br>
<ul>
  <li><a  style="background-color: white;" href="">Home</a></li>
   <li>  <div class="dropdown">
   <button class="dropbtn">Create Ad</button>
  <div class="dropdown-content">
    <a href="">Event</a>
    <a href="">Discount</a>
   
  </div>
</div></li>
<li><a href="">Owner profile</a></li>
  <li><div class="dropdown">
  <button class="dropbtn">Sell items</button>
  <div class="dropdown-content">
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">Pricing Properties</button>
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
   <button class="dropbtn">PostProjects</button>
   <div class="dropdown-content">
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
</div></li>

</ul>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Buying"%>

<% ArrayList<Buying> searching_m =(ArrayList<Buying>)request.getAttribute("Arraymettan"); %>


<h2 align="center"><font><strong>Buying history</strong></font></h2>
<table   class="table table-bordered table-bordered-custom" align="center" cellpadding="5"  border="0">

<tr bgcolor="white">

<th><b>BuyID</b></th>
<th><b>Colour</b></th>
<th><b>Price</b></th>
<th><b>Customer_id</b>
<th><b>Item_name</b>
</th>

</tr>

<%for(int i = 0; i < searching_m.size(); i++) {
	
	
   

	
	

%>
  
  <tr bgcolor="#00FFFFFF">    
<td><%=searching_m.get(i).getBuyid()%></td>
<td><%=searching_m.get(i).getPrice()%></td>
<td><%=searching_m.get(i).getColor()%></td>
<td><%=searching_m.get(i).getCusID()%></td>
<td><%=searching_m.get(i).getItemName()%></td>


	
</td>
</tr>
<%} %>

</body>
</html>