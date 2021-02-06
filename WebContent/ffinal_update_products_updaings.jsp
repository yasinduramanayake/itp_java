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
  width: 60%;
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

.crt{
float: right;
}

</style>

<script>
	function check() {
		if (document.getElementById("tick").checked) {
			document.getElementById("button").disabled = false;
		}

		else {
			document.getElementById("button").disabled = true;
		}
	}
</script>

<link rel="stylesheet" href="Footer.css">
</head>
<body>

<form method="get" action="LogOut_servelet">
<button type="submit" value="Logout"  style="float: right;
  width: 100px;
  border: 3px solid #73AD21;
  padding: 10px;" >Logout</button>
</form>


<ul>
  <li><a  style="background-color: grey;" href="AdminDashboard.jsp">Dashboard</a></li>
   <li>  <div class="dropdown">
   <button class="dropbtn">Create_Ad</button>
  <div class="dropdown-content">
    <a href="">Event</a>
    <a href="">Discount</a>
   
  </div>
</div></li>
<li><div class="dropdown">
  <button class="dropbtn">Owner_Profile</button>
  <div class="dropdown-content">
    <a href="OwnerRegister.jsp">Owner Registration</a>
    <a href="ownerRtrieve(backend).jsp">See Owner Profile</a>
  
  </div>
</div></li>

  <li><div class="dropdown">
  <button class="dropbtn">Online_Store</button>
  <div class="dropdown-content">
    <a href="insertItems.jsp">Enter Items</a>
    <a href="Household.jsp">Household Furniture</a>
    <a href="HotelFurniturejsp.jsp">Hotel Furniture</a>
    <a href="OfficeFurnitures.jsp">Office Furniture</a>
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">Pricing_Properties</button>
  <div class="dropdown-content">
   <a href="Pricing_Properties.jsp">Enter properties</a>
    <a href="HouseHoldFurniturePropeties.jsp">Household Furniture properties</a>
    <a href="HotelFurnitureProperties.jsp">Hotel Furniture properties</a>
    <a href="Office_Furniture_properties.jsp">Office Furniture properties</a>
    <a href="Sofasetes_properties.jsp">Sofasetes Furniture properties</a>
    <a href="Pantey_and_kitchen.jsp">Pantry&Kitchen Furniture properties</a>
    <a href="WoodenDecking_and_timber_floring.jsp">Wooden&Decking Furniture properties</a>
    
  </div>
</div></li>
  <li><a href="">Feebacks</a></li>
  
  <li><a href="">Past_Project</a></li>

<li><a href="cartRETRIVE.jsp">
<div class="crt">Cart</div></a></li>


 <li><a href="visiteDetails.jsp">All_Visitting_requests</a></li>
</ul>
	<br><br><br><br><br>
	<center>
	  <div class="container" style="background-color:#f1f1f1;background-color: rgba(255,255,255,0.5); width:50% ;length:50%;">
		
	
	

	<form action="updates_prducts_final" method="post">
	<h1> Insert
			Item Details</h1><br><br>
		
			
				
					<label for="uname"><b>Update Item Image :</b><br>
				<center><input name="myimg0" type="file" id="itemImage"
						placeholder="Add Image" required style="width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;" > <input name="myimg"
						type="text" value="<%=request.getAttribute("msgimg")%>" id="itemImageB64" hidden></center><br>
				
					
				
					<input name="Itemcategory" id="Itemcategory" type="text"
						hidden placeholder="Enter the Category" value="<%=request.getAttribute("cat1")%>" required >
 
							
				
					<label for="uname"><b>Update Item Name :</b><br>
				
					<input name="Itemname" type="text" id="Itemname"
							placeholder="Enter Item Name" value="<%=request.getAttribute("mitemna")%>" required style="width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;"><br><br>
				


				
					<label for="uname"><b>Update Description :</b><br>
				
					<input name="Discription" type="text" id="Discription"
							placeholder="Discription" value="<%=request.getAttribute("despro")%>" required style="resize: vertical; width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;"><br><br>
			
				<input name="link" type="number" id="Itemlink"
						step="1" hidden	 placeholder="Enter Item Name" value="<%=request.getAttribute("linkproup")%>" required>
							
							    <input type="number"  hidden required name="Itemid" value="<%=request.getAttribute("proid")%>">

		
		<label for="uname"><b>Update Price:</b><br>
				
					<input name="pricingfinal" type="number" step="0.01" id="Discription"
							placeholder="Discription" value="<%=request.getAttribute("pricesell")%>" required style="resize: vertical; width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;"></textarea><br><br>
  
			<button type="submit" value="ADD" 
				>Update Details</button><br> <br>
				
		</div>		
	</form>
	
	</center>

	<script type="text/javascript">
		document.getElementById('itemImage').onchange = function() {
			var file = document.getElementById('itemImage').files[0];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function() {
				//console.log(reader.result);
				document.getElementById('itemImageB64').value = reader.result;
			};
			reader.onerror = function(error) {
				console.log('Error: ', error);
			};
		};
	</script>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

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
<</div>
<</body>



<</html>