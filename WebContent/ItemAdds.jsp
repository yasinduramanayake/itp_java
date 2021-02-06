<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M & M Creations</title>
<link href="style.css" rel="stylesheet">
<style>
body{
	background-image:url("images/sofa2.jpg");
}
#two{
	font-size:20px;
	background-color: #DDA0DD;
	box-shadow: 0 5px #666;
	font-family: cursive;
}
#f{

	font-family: cursive;
	color:#000000;
	font-size: 30px;
}
#h{

	font-family: cursive;
	color:#8OOOOO;
	font-size: 30px;
}

</style>

</head>
<body>

<div class="header">
	
	
	<center>
	<h1>Item Advertisement</h1>
	<table>
	
	<c:forEach var="cus" items="${iDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="price" value="${cus.price}"/>
	<c:set var="discount" value="${cus.discount}"/>
	<c:set var="category" value="${cus.category}"/>
	<c:set var="itemcode" value="${cus.itemcode}"/>
	
	<tr>
		<td id="f">Item ID</td>
		<td id="f">${cus.id}</td>
	</tr>
	<tr>
		<td id="f">Price</td>
		<td id="f">${cus.price}</td>
	</tr>
	<tr>
		<td id="f">Discount</td>
		<td id="f">${cus.discount}</td>
	</tr>
	<tr>
		<td id="f">Category</td>
		<td id="f">${cus.category}</td>
	</tr>
	<tr>
		<td id="f">Item Code</td>
		<td id="f">${cus.itemcode}</td>
	</tr>

	</c:forEach>
	</table><br><br>
	
	<form action="itemPdf2" method="post" >
      <button type ="submit" id="two">Generate pdf of All Item Details </button>
    </form>
	</center>
	
	
	<center>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 1</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC001" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
		
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 2</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC002" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 3</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC005" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 4</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC008" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 5</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC007" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 6</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC004" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 7</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC003" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 8</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC019" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code 9</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC018" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="iAdds" method="post">
	<center>
		<d id="h">Item Code10</d> <input type="text" name="icode" required style="height:30px; width:40px;" value = "IC011" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	</center>
	
</div>	

</body>
</html>