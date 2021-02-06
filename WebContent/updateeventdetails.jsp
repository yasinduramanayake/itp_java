<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M & M Creations</title>
<style>
body{
	background-image:url("images/ball.jpg");
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

	<%
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String eventcode = request.getParameter("eventcode");
	%>

	<form action="updateE" method="post">
	<center>
	<h1>Update Event Advertisement</h1>
	<table>
	<tr>
		<td><d id="f">ID </d></td>
		<td><input type="text" name="id" value="<%= id %>" readonly required style="height:25px; width:150px;"></td>
	</tr>
	<tr>
		<td><d id="f">Title </d></td>
		<td><input type="text" name="title" value="<%= title %>" required style="height:25px; width:150px;"></td>
	</tr>
	<tr>
		<td><d id="f">Description </d></td>
		<td><input type="textarea" name="description" value="<%= description %>" required style="height:25px; width:150px;"></td>
	</tr>
	<tr>
		<td><d id="f">Category </d></td>
		<td><select name="category" value="<%= category %>" required style="height:37px; width:156px;">
                <option>Hotel</option>
                <option>Office</option>
                <option>Pantey&Kitchen</option>
                <option>Sofa</option>
                <option>Wooden&Decking</option>
                <option>HouseHold</option>
                </select ></td>
	</tr>
		<td><d id="f">Event Code </d></td>
		<td><input type="text" name="eventcode" value="<%= eventcode %>" required style="height:25px; width:150px;"></td>
	
	</table><br><br>
		
		<input type="submit" name="submit" value="Update Event Data" id="two"><br>
	</center>
	</form>

</body>
</html>