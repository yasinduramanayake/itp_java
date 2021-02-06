<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<center>
	
	<h1>Item Advertisement</h1>
	<table>
	<c:forEach var="cus" items="${itemDetails}">
	
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
	
	
	<c:url value="updateitemdetails.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="discount" value="${discount}"/>
		<c:param name="category" value="${category}"/>
		<c:param name="itemcode" value="${itemcode}"/>
	
	</c:url>
	
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update Item Details" id="two">
	</a>
	
	<c:url value="deleteitem.jsp" var="itemdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="discount" value="${discount}"/>
		<c:param name="category" value="${category}"/>
		<c:param name="itemcode" value="${itemcode}"/>
	
	</c:url>
	
	<a href="${itemdelete}">
	<input type="button" name="delete" value="Delete Item Details" id="two">
	</a><br><br>
	
	<a href="AdminDashboard.jsp" id="two">Back to Dashboard</a>
	
	</center>

</body>
</html>