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

 background-image:url(images/Background.jpeg);
 background-repeat: no-repeat;
 background-size:  130%;
}
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */


/* Set a style for all buttons */
input[type=number],input[type=text],select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;
}
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
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

h1{
color:black;
}

</style>

</head>
<body>
<form method="get" action="LogOut_servelet">
<button type="submit"  style="float: right;
  width: 100px;
  border: 3px solid #73AD21;
  padding: 10px;" >Logout</button>
</form>
<ul>
  <li><a style="background-color:grey;" href="">Home</a></li>
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
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">ComProject</button>
  <div class="dropdown-content">
    <a href="">Civil Construction</a>
    <a href="">Designing</a>
    <a href="">Plumbing workers</a>
  </div>
</div></li>
  <li><a href="">Owner_Profile</a></li>
   <li><a href="">Feedback</a></li>
   <li><a href="">Aboutus</a></li>
    
</ul>

<center>



<center>
<br><br>


<div class="modal-content animate">

  <center><form method="post" action="Insert_buying">
  
  
  <h2 id="head2" >Add buy</h2></center>
  
 <div class="container" style="background-color:#f1f1f1">
 
  <div class="row"><div class="col-25"><label for="price">Price</label></div><div class="col-75"><input type="number" step="0.01" name="price" id="price"></div></div>
  <div class="row"><div class="col-25"><label for="colour">Colour</label></div><div class="col-75"><input type="text" name="colour" id="colour"></div></div> 
  <div class="row"><div class="col-25"><label for="itemname">Item Name</label></div><div class="col-75"><input type="text" name="itemname" id="itemname"></div></div> 
 

 <button class="button" onclick="myFunction()">BUY AND PAY</button>
 </form>
 
 <button type="button" id="demo"  onclick="demo()">DEMO2</button>
 
<p id="demo"></p>

<script>
function myFunction() {
  var txt;
  if (confirm("Do you want to buy this?  ")) {
    txt = "You sucessfully buy this item !";
  } else {
    txt = "You pressed Cancel!";
  }
  document.getElementById("demo").innerHTML = txt;
}
</script>

</div></center>
  </center>
  
  <script type="text/javascript">
  function demo(){
	  document.getElementById("price").value = "5000.00";
	  document.getElementById("colour").value = "BLACK";
	  document.getElementById("itemname").value = "BED";
	   
	  
  }
  	
  </script>
     

</body>
</html>