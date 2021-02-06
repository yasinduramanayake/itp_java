<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>M & M Creations</title>
<style>
body{
	background-image:url("H:/images/ball.jpg");
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
		String price = request.getParameter("price");
		String discount = request.getParameter("discount");
		String category = request.getParameter("category");
		String itemcode = request.getParameter("itemcode");
	%>
	
	<form action="delItem" method="post">
	<center>
	<h1>Delete Item Advertisement</h1>
	<table>
	<tr>
		<td><d id="f">ID </d></td>
		<td><input type="text" name="id" value="<%= id %>"  required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>
		<td><d id="f">Price </d></td>
		<td><input type="text" name="price" value="<%= price %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>
		<td><d id="f">Discount </d></td>
		<td><input type="text" name="discount" value="<%= discount %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
	<tr>
		<td><d id="f">Category </d></td>
		<td><input type="text" name="category" value="<%= category %>" required style="height:25px; width:150px;" readonly></td>
	</tr>
		<td><d id="f">Item Code </d></td>
		<td><input type="text" name="itemcode" value="<%= itemcode %>" required style="height:25px; width:150px;" readonly></td>
	
	</table>
		
		<input type="submit" name="submit" value="Delete Item " id="two"><br>
	</center>
	</form>
	
</body>
</html>