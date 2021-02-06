<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
	background-image:url("images/bed1.jpg");
}
#two{
	font-size:20px;
	background-color: #DDA0DD;
	box-shadow: 0 5px #666;
	font-family: cursive;
}
#f{
	font-family: cursive;
	color:#8OOOOO;
	font-size: 30px;
}

</style>

</head>
<body>
	
	<form action="#" method="post">
	<center>
		<d id="f">Item Code </d> <input type="text" name="itemcode" required style="height:30px; width:150px;"><br><br>
		
		<input type="submit" name="submit" value="Show Item" id="two">
	</center>
	</form>
</body>
</html>