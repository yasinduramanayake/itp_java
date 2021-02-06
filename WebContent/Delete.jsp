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

<h1 id=he><center>Delete Order</center></h1>
<center>
<form method="post" action="deleteServlet">
	<B>
	<d id="f">orderID:</d>
	<br><input type="number" id="f" name="oID" placeholder="orderid" required style="height:50px; width:400px;">
	<br><br>
	
	
	
	<center>
 	
 	<input type="submit" value="Delete" id="two"><br></center>
	 
 
</center>
</body>
</html>