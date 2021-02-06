<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M & M Creations</title>
<link href="style.css" rel="stylesheet">

<style>
body{
	background-image:url("images/ball.jpg");
}
#two{
	font-size:23px;
	background-color: #DDA0DD;
	box-shadow: 0 5px #666;
	font-family: cursive;
}
#f{
	font-family: cursive;
	color:#000000;
	font-size: 30px;
}

</style>

</head>
<body>

<div class="header-event">

<center>

	<form action="viewE" method="post">
	<h1>Previous Event Adds</h1>

	<div class="form-box">
	
	<input type="text" name="eventcode" class="search-field business" placeholder="Search Event Code here">
	<input class="search-btn" type="submit" name="submit" value="Search">
	
	</div>
		
	</form>


	<form action = "insertE" method="post">
	
	<h1>New Event</h1>
	<table>
	<tr>
		<td><d id="f">  Title </d></td>
		<td><input type="text" name="title" id="title" placeholder="Title" required style="height:30px; width:250px;"></td>
	</tr>
	<tr>
		<td><d id="f">  Descripton </d></td>
		<td><textarea type="text" name="description" id="description" placeholder="Descripton" required style="height:30px; width:250px;"></textarea></td>
	</tr>
	<tr>
		<td><d id="f">  Category </d></td>
		<td><select name="category" id="category" required style="height:37px; width:256px;">
                <option>Hotel</option>
                <option>Office</option>
                <option>Pantey&Kitchen</option>
                <option>Sofa</option>
                <option>Wooden&Decking</option>
                <option>HouseHold</option>
                </select ></td>
	</tr>
	<tr>	
		<td><d id="f">  Event Code </d></td>
		<td><input type="text" name="eventcode" id="eventcode" placeholder="Event Code" required style="height:30px; width:250px;"></td>
	</tr>
	</table><br>
	
		<input type="button" id="demo1" value="DEMO 1" onClick="demo()">
		<input type="submit" name="submit" value="Submit" id="two">
	
	</form><br>

		
	<form action="eventPdf" method="post" >
      <button type ="submit" id="two">Get Event History Pdf</button>
    </form><br>
    
    <a href="AdminDashboard.jsp" id="two">Back To Dashboard</a>

</center>
</div>
</body>

<script type="text/javascript">
	function demo(){
		document.getElementById("title").value = "Free Dilivery Service";
		document.getElementById("description").value = "If your total price greater than fifty thousand rupees, dilivery charge will be free ";
		document.getElementById("category").value = "Sofa";
		document.getElementById("eventcode").value = "EC025";
	}
</script>
</html>