<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M & M Creations</title>
<style>
body{
	background-image:url("images/sofa2.jpg");
}
#two{
	font-size:23px;
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
	
	<form action="apple" method="post">
	<center>
	<h1>Get Your Invitation Details</h1>
		<d id="f">Customer Register Id</d> <input type="text" name="registerid" placeholder="Enter Your Register Id" required style="height:30px; width:200px;">
		
		<input type="submit" name="submit" value="View Details" id="two">
	</center>
	</form>
	
	<center>
	<form action = "insert" method="post">
	<h1>Insert Order Details</h1>
	<table>
	<tr>
		<td id="f">Category </td>
		<td><select name="category" id="category" required style="height:37px; width:206px;">
                <option>Hotel</option>
                <option>Office</option>
                <option>Pantey&Kitchen</option>
                <option>Sofa</option>
                <option>Wooden&Decking</option>
                <option>HouseHold</option>
                </select ></td>
	</tr>	
	<tr>	
		<td id="f">Customer Name </td>
		<td><input type="text" name="fullName" id="fullName" placeholder="Name" required style="height:30px; width:200px;"></td>
	</tr>
	<tr>	
		<td id="f">Contact number </td>
		<td><input type="text" name="phone" id="phone" placeholder="Contact Number" required style="height:30px; width:200px;"></td>
	</tr>
	<tr>	
		<td id="f">Email </td>
		<td><input type="text" name="email" id="email" placeholder="Email" required style="height:30px; width:200px;"></td>
	</tr>
	<tr>	
		<td id="f">Register Id </td>
		<td><input type="text" name="registerid" id="registerid" placeholder="Register Id" required style="height:30px; width:200px;"></td>
	</tr>	
		
	</table><br>
	
	<input type="button" id="demo2" value="DEMO 2" onClick="demo()">
	<input type="submit" name="submit" value="Submit" id="two"><br><br>
	
	</form>
	
	<form action="createpdf" method="post" >
      <button type ="submit" id="two">Get Invitation History Pdf</button>
    </form>
	</center>
</body>

<script type="text/javascript">
	function demo(){
		document.getElementById("category").value = "Pantey&Kitchen";
		document.getElementById("fullName").value = "Anura Gunawardana";
		document.getElementById("phone").value = "0774357231";
		document.getElementById("email").value = "anuragunawardana@gmail.com";
		document.getElementById("registerid").value = "CID030";
	}
</script>
</html>