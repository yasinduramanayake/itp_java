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


.checkout {
	height: 300px;
	width: 400px;
	margin: 20px auto;
	border: 2px solid black;
	text-align: center;
}
body{
 background-image:url("file:///D:/shopping/WebContent/WEB-INF/lib/img/back.jpeg");
 background-size: 100%;
 }

 #head1{
 font-family: cursive;
 color:white;
 }
  #head2{
 font-family: cursive;
 color:white;
 }
  #para1{
 color:white;
 }

</style>
</head>
<body>
	<br><br><br>
	<ul><li><a href="">Home</a></li>
   	<li> <div class="dropdown">
    <button class="dropbtn">Advertiesment</button>
  	<div class="dropdown-content">
  	<a href="">Event</a><a href="">Discount</a></div></div></li>
   	<li><div class="dropdown">
    <button class="dropbtn">Store</button>
    <div class="dropdown-content">
   	<a href="">Household Furniture</a>
   	<a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a></div></div></li>
  	<li><div class="dropdown">
 	<button class="dropbtn">Project</button>
    <div class="dropdown-content">
    <a href="">Civil Construction</a>
    <a href="">Designing</a>
    <a href="">Plumbing workers</a></div></div></li>
    <li><a href="">OwnerProfile</a></li>
    <li><a href="">Feedback</a></li>
    <li><a href="">Aboutus</a></li></ul>

<h1 id="head1">My Cart</h1>
<h3 id="head2">Welcome to your cart ! </h3>
<form>

<p id ="para1">Price: </p><input type="text" id="price" ><br>
<p id ="para1">Quantity:</p> <input type="text" id="quantity" /><br>
<input type="button" onClick="multiplyBy()" Value="Calculate Price" />
<a href="DELETECART.jsp"><button>Confirm And Pay</button></a>

</form>
<p id ="para1">Total : <br>
<span id = "result"></span>
</p>
<a href="ADDTOCART.jsp"><button>ADD NEW</button></a>
<a href="UPDATECART.jsp"><button>UPDATE</button></a>
<a href="DELETECART.jsp"><button>DELETE</button></a>

<script>

function multiplyBy()
{
        num1 = document.getElementById("price").value;
        num2 = document.getElementById("quantity").value;
        document.getElementById("result").innerHTML = num1 * num2;
}
</script>



</body>
</html>