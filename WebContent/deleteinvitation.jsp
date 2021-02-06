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
	font-size:25px;
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
		String category = request.getParameter("category");
		String fullName = request.getParameter("fullName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String registerid = request.getParameter("registerid");
	%>
	
	<center><h1>Delete Your Invitation </h1></center><br>
	
	<form action="delete" method="post">
	<center>
	<table>
	<tr>
		<td><d id="f">Customer ID </d></td>
		<td><input type="text" name="id" value="<%= id %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>	
		<td><d id="f">Category </d></td>
		<td><input type="text" name="category" value="<%= category %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>
		<td><d id="f">Name </d></td>
		<td><input type="text" name="fullName" value="<%= fullName %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>
		<td><d id="f">Phone number </d></td>
		<td><input type="text" name="phone" value="<%= phone %>" required style="height:25px; width:150px;"readonly></td>
	</tr>
	<tr>
		<td><d id="f">Email </d></td>
		<td><input type="text" name="email" value="<%= email %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>
		<td><d id="f">Register ID </d></td>
		<td><input type="text" name="registerid" value="<%= registerid %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	</table><br><br>
	
		<input type="submit" name="submit" value="Delete My Invitation" id="two"><br>
	</center>
	</form>

</body>
</html>