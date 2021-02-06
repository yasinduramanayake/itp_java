<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete</title>
<style>
body{
 background-image:url("C:/Users/Dhara/eclipse-workspace/one/wood.jpg");
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
color:#9b5c45;
font-size: 20px;
}
</style>
</head>
<body>
<h1 id=he><center>Delete Transportation</center></h1>
<form method="post" action="DeleteTrans">
	<B>
	<d id="f">Customer Name:</d>
	<br><input type="text"  id="f" name="name" placeholder="name"  style="height:50px; width:400px;">
	<br><br>
	
	<center>
 	
 	<input type="submit" value="Delete" id="two"><br></center>
	 
 
</form>
</body>
</html>