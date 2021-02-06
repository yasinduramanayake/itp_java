<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>update</title>

<style>
body{
 background-image:url("images/wood2.jpg");
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
#f{
font-family: cursive;
color:#9c5d45;
font-size: 17px;}
</style>
</head>
<body>
<h1 id=he><center>Update Delivery Form..</center></h1>
<form method="post" action="up_transport">
	<B>
	
	<d id="f">Customer Name:</d>
	<br><input type="text"  id="f" name="name" placeholder="Name"  style="height:50px; width:400px;">
	<br><br>
	
	<d id="f">Distance</d>
	<br> <input type="number" step="0.1"  id="f" name="Distance" placeholder="Distance"  style="height:50px; width:400px;">
	<br><br>
	<d id="f">Location:</d>
	<br><input type="text" id="f" name="location" placeholder="Location"  style="height:50px; width:400px;">
	<br><br>
	<d id="f">Street Size:</d>
	<br><input type="number" step="0.1" id="f" name="size" placeholder="size"  style="height:50px; width:400px;">
	<br><br>
	<d id="f">Payment Method:</d>
	<br><input type="text" id="f" name="payment" placeholder="Payment method"  style="height:50px; width:400px;">
	<br><br>
	
	<center>
 	<input type= "submit" id="two"value="Update">

	 
 
	

</form>
</body>
</html>