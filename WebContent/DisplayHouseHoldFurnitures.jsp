<%@page import="java.sql.Blob"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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


body {font-family: Arial, Helvetica, sans-serif;
}

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


/* Center the image and position the close button */





/* The Close Button (x) */



.search{

float: right;
 
  border: 3px  ; 
  padding: 12.5px;
  background-color: #191819;

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
 .container {
  padding: 16px;
  border-radius: 15px;
}
 
</style>

<meta charset="ISO-8859-1">
<title>Hotel Furnitures</title>
<link rel="stylesheet" href="Footer.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<ul>

<form method="get" action="LogOut_servelet">
<button type="submit"  style="float: right;
  width: 100px;
  border: 3px solid #73AD21;
  padding: 10px;" >LOGOUT</button>
</form>
 <li><a  style="background-color: #191819;" href="AdminDashboard.jsp">Dashboard</a></li>
   
  <li><div class="dropdown"  >
  <button class="dropbtn" style="background-color: #191819;  border-radius: 0px;" >Online_Store</button>
  <div class="dropdown-content">
    <a href="DisplayHouseHoldFurnitures.jsp">Household Furniture</a>
    <a href="DisplayHotelFurniture.jsp">Hotel Furniture</a>
    <a href="DisplayOfficeFurnitures.jsp">Office Furniture</a>
  </div>
</div></li>
  <li><a style="background-color: #191819;" href="pastProjectRetrive.jsp">Company_Projects</a></li>
  <li><a style="background-color: #191819;" href="OwnerRetriew.jsp">Owner_Profile</a></li>
   
<li><a style="background-color: #191819;" href="cartCutomerRetrive.jsp">
Your_cart</div></a></li>
      
<li><a style="background-color: #191819;" href="CustomerRetrieve.jsp">Your_Profile</div></a></li>

<li><div class="search">
<div id="serachDiv"><input id="searchTxt" type="search" placeholder="search item...." ></input><input type="submit" id="serachBtn"  value="search" onclick="filterProducts()" ><input type="submit" id="clearSearchBtn" onclick="clearFilter()"value ="Back"></div>
</li>
    
      
   
</ul>

	
	
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.PreparedStatement"%>
	<%@page import="java.sql.Connection"%>
	<%@page import="Db.Db_connection"%>
	<%@page import="java.io.File"%>

	<%
		Connection connection;
	
		PreparedStatement preparedStatement;
	
		ResultSet res;
	%>
	<br>
	<br>
	<br>


	<center>
		<h1>House Hold
			Furnitures</h1>
	</center><br><br>

	

	<div>
	
	<div class="row">
	
	<%
		try {
			connection = Db_connection.getConnection();

			String sql1 = "select * from products where category=?";

			preparedStatement = connection.prepareStatement(sql1);

			preparedStatement.setString(1, "House");

			res = preparedStatement.executeQuery();
			int count = -1;
			while (res.next()) {
				count++;
				if(count%4==0){
	%>		
		</div><div class="row">
	<%		
				}
	%>
	
		<div class="product">
		<table>
		
			
				<tr>
					<td><img alt="img" style="width: 175px;" src="<%=res.getString("image")%>" /><br><br></td>
				</tr>
				<tr>
					<td><%=res.getString("Item_name")%><br><br></td>
				</tr>
				<tr>
					<td><%=res.getString("description")%><br><br></td>
				</tr>
				<tr>
					<td>RS:<%=res.getDouble("Price")%><br><br></td>
				</tr>
					
				<tr>
					<td>
					
					</td>
				</tr>
				
				<tr>
					<td>
					<form action="INSERT_cart" method="post">
					<input type="number" step="0.01" id="price" name="price" value="<%=res.getDouble("Price")%>" hidden required >
					  color:</br><select name="colours" style="resize: vertical; width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;">
                <option>Black</option>
                <option>Brown</option>
                <option>Grey</option>
                <option>White</option>               
                <option>lightgrey</option>
                </select ></br></br>
                <d id="f">Quantity :</d></br>
					<input type="number" step="1" id="quantity" min="0" placeholder="Enter quantity" required name="quantity" style="resize: vertical; width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;" ><br><br>
					<button type="submit" class="button" id="button" value="Add to Cart" style=" background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 80%;
  border-radius: 12px; ">Add to Cart</button>
					</form>
					</td>
				</tr>
				
				
			</table>
			
		
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
	<script>
$(document).ready(function(){
  $("#myInput19").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable19 tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
	<script type="text/javascript">
		function filterProducts(){
			console.log("Called me?");
			var keyword = document.getElementById("searchTxt").value;
			var products = document.getElementsByClassName("product");
			if(keyword==""){
				for(i=0; i<products.length;i++){
			    	products[i].classList.remove("hide");
			    	products[i].classList.add("show");
				}
			}else{
				for(i=0; i<products.length;i++){
				    if(products[i].innerText.includes(keyword)){
				    	console.log("found 1");
				    	products[i].classList.remove("hide");
				    	products[i].classList.add("show");
				    }else{
				    	products[i].classList.remove("show");
				    	products[i].classList.add("hide");
				    }
				}
			}
		}

		function clearFilter() {
			document.getElementById("searchTxt").value="";
			var products = document.getElementsByClassName("product");
			for (i = 0; i < products.length; i++) {
				products[i].classList.remove("hide");
				products[i].classList.add("show");
			}
		}
	</script>
	<center>
	Do you want a company agent to visit your home or organization?
<br><br><form action="CreateVisite.jsp"><Button class="button"  type="submit"  style=" background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 20%;
  border-radius: 12px; ">Create Visit</Button></form>
</center>


<br><br><br><br><br><br>
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