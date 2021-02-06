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
	
	<h1>Event Advertisement</h1>
	<table>
	<c:forEach var="cus" items="${eDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="title" value="${cus.title}"/>
	<c:set var="description" value="${cus.description}"/>
	<c:set var="category" value="${cus.category}"/>
	<c:set var="eventcode" value="${cus.eventcode}"/>
	
	<tr>
		<td id="f">Item ID</td>
		<td id="f">${cus.id}</td>
	</tr>
	<tr>
		<td id="f">Title</td>
		<td id="f">${cus.title}</td>
	</tr>
	<tr>
		<td id="f">Description</td>
		<td id="f">${cus.description}</td>
	</tr>
	<tr>
		<td id="f">Category</td>
		<td id="f">${cus.category}</td>
	</tr>
	<tr>
		<td id="f">Event Code</td>
		<td id="f">${cus.eventcode}</td>
	</tr>

	</c:forEach>
	</table><br><br>
	
	
	<c:url value="updateeventdetails.jsp" var="eventupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="title" value="${title}"/>
		<c:param name="description" value="${description}"/>
		<c:param name="category" value="${category}"/>
		<c:param name="eventcode" value="${eventcode}"/>
	
	</c:url>
	
	<a href="${eventupdate}">
	<input type="button" name="update" value="Update Item Details" id="two">
	</a>
	
	<c:url value="deleteevent.jsp" var="itemdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="title" value="${title}"/>
		<c:param name="description" value="${description}"/>
		<c:param name="category" value="${category}"/>
		<c:param name="eventcode" value="${eventcode}"/>
	
	</c:url>
	
	<a href="${itemdelete}">
	<input type="button" name="delete" value="Delete Item Details" id="two">
	</a><br><br>
	
	<a href="AdminDashboard.jsp" id="two">Back to Dashboard</a>
	
	</center>

</body>
</html>