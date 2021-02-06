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
	<center>
	<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="category" value="${cus.category}"/>
	<c:set var="fullName" value="${cus.fullName}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="registerid" value="${cus.registerid}"/>
	<h1>Invitation Details</h1>
	<tr>
		<td id="f">Customer ID</td>
		<td id="f">${cus.id}</td>
	</tr>
	<tr>
		<td id="f">Category</td>
		<td id="f">${cus.category}</td>
	</tr>
	<tr>
		<td id="f">Customer Name</td>
		<td id="f">${cus.fullName}</td>
	</tr>
	<tr>
		<td id="f">Contact Number</td>
		<td id="f">${cus.phone}</td>
	</tr>
	<tr>
		<td id="f">Customer Email</td>
		<td id="f">${cus.email}</td>
	</tr>
	<tr>
		<td id="f">Register Id</td>
		<td id="f">${cus.registerid}</td>
	</tr>

	</c:forEach>
	</table><br><br>
	
	
	<c:url value="updatecustomer.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="category" value="${category}"/>
		<c:param name="fullName" value="${fullName}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="registerid" value="${registerid}"/>
	</c:url>
	
	<a href="${cusupdate}">
	<input type="button" name="update" value=" Update My Data " id="two">
	</a>
	
	
	
	<c:url value="deleteinvitation.jsp" var="invitationdelete">
		<c:param name="id" value="${id}" />
		<c:param name="category" value="${category}" />
		<c:param name="fullName" value="${fullName}" />
		<c:param name="phone" value="${phone}" />
		<c:param name="email" value="${email}" />
		<c:param name="registerid" value="${registerid}" />
	</c:url>
	
	<a href="${invitationdelete}">
	<input type="button" name="delete" value=" Delete My Invitation " id="two">
	</a><br><br><br>
	
	
    
    <a href="Customer_Dashboard.jsp" id="two">Back To Dashboard</a>
    
	</center>

</body>
</html>