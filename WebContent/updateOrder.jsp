<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
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
#f{
font-family: cursive;
color:#e1ad01;
font-size: 20px;}
</style>
</head>
<body>

<h1 id=he><center>Update Order</center></h1>
<center>
<form method="post" action="updateServlet" >
	<B>

		<d id="f">Enter CustomerId:</d>
	<br><input type="number" step="1" id="f" name="oid" placeholder="order id"  required style="height:50px; width:400px;">
	<br><br>
	<d id="f">Update Price</d>
	<br> <input type="number" step="0.01"  id="f" name="Price" placeholder="Price" required style="height:50px; width:400px;">
	<br><br>
	<d id="f">Update Quantity :</d>
	<br><input type="number" step="1" id="f" name="Quantity" placeholder="Quantity" required style="height:50px; width:400px;">
	<br><br>
	<d id="f">Update Email</d>
	<br><input type="text" id="f" name="email" placeholder="Email" required style="height:50px; width:400px;">
	<br><br>
	
	
	<center>
 	
 	<input type="submit" value="Update" id="two"><br></center>
	 
 </center>

</body>
</html>