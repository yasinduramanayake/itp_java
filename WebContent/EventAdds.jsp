<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M & N Creations</title>
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
	color:#8OOOOO;
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
	<h1>Event Advertisements</h1>
	<table>
	
	<c:forEach var="cus" items="${eDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="title" value="${cus.title}"/>
	<c:set var="description" value="${cus.description}"/>
	<c:set var="category" value="${cus.category}"/>
	<c:set var="eventcode" value="${cus.eventcode}"/>
	
	<tr>
		<td id="f">Event ID</td>
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
	
	<form action="eventPdf2" method="post" >
      <button type ="submit" id="two">Generate pdf of All Event Details </button>
    </form>
	</center>
	
	
	<center>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 1</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC001" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
		
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 2</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC002" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 3</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC003" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 4</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC004" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 5</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC008" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 6</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC020" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 7</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC005" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 8</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC006" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code 9</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC007" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	<form action="eAdds" method="post">
	<center>
		<d id="h">Event Code10</d> <input type="text" name="ecode" required style="height:30px; width:40px;" value = "EC008" readonly>
		
		<input type="submit" name="submit" value="View More Details" id="two">
	</center>
	</form>
	
	</center>
	
</div>

</body>
</html>