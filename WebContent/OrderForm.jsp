<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color:#4CAF50;
}

li {
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
  background-color: #111;
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
  background-color: #4CAF50;
  font-family: inherit;
  margin: 0;
}

body{
 background-image:url("images/back.jpeg");
 background-size: 100%;
 }
 #he{
 font-family: cursive;
 color:#F6B88B;}
  #two{font-size:20px;
  background-color: #c39b77;
  box-shadow: 0 5px #666;
  font-family: cursive;
  }
  
   #three{font-size:20px;
  background-color: #c39b77;
  box-shadow: 0 5px #666;
  font-family: cursive;
  }
  
  
   
   #four{font-size:20px;
  background-color: #c39b77;
  box-shadow: 0 5px #666;
  font-family: cursive;
  
 }
  
   #five{font-size:20px;
  background-color: #c39b77;
  box-shadow: 0 5px #666;
  font-family: cursive;
  
 }
  
  

#f{
font-family: cursive;
color:#e1ad01;
font-size: 20px;}
#head1{
color:#F6B88B;
}
</style>
</head>
<body>
<ul>
  <li><a href="">Home</a></li>
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

<center>
<h1 id="head1">Order Form..</h1>
<form method="post" action="Order_servelet">

	
	<B>
	
	
	<d id="f"> Price:</d>
	<br> <input type="number" step="0.01"  name="Price" id="Price"required placeholder="Price"  style="height:50px; width:400px;">
	<br><br>
	<d id="f">Quantity :</d>
	<br><input type="number" step="1"  name="Quantity" id="Quantity" required  placeholder="Quantity"  style="height:50px; width:400px;">
	<br><br>
	<d id="f"> Email:</d>
	<br><input type="email"  name="Email" id="Email" required placeholder="Email"  style="height:50px; width:400px;">
	<br><br>

	
	<input type="button" id="demo2" value="DEMO 2" onClick="demo()" id="five">
	<input type="submit" name="submit" value="submit" id="two"><br><br>
	
	</form>
	<form method="post" action="DisplayOrder.jsp"><input type="submit" value="viewOrders" id="three"></form>
	
	</B>
	
	
</center>
	
 	<form method ="post" action ="pdf_genV">
 	
 	<center><input type="submit" value="genarate pdf" id="four"></center>
 	</form>
</body>

<script type ="text/javascript">
	function demo(){
		document.getElementById("Price").value="12000";
		document.getElementById("Quantity").value="5";
		document.getElementById("Email").value="amila123@gmail.com";
		document.getElementById("cusid").value="C1";
		
	}
</script>



</html>