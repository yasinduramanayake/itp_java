<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Transport_details"%>


<%Object[] row = new Object[5];%>


<% ArrayList<Transport_details> searchingd =(ArrayList<Transport_details>)request.getAttribute("Arraydhara");%>


<h2 align="center" style="color:white;"><font><strong>HouseHold Furniture properties</strong></font></h2>
<center>
<div class="container" style="background-color:#f1f1f1; width:80% ;length:80%;">
<table   class="table table-bordered table-bordered-custom" align="center" cellpadding="5"  border="0">

<tr bgcolor="white">

<th><b>Name</b></th>
<th><b>Street size</b></th>
<th><b>pay method</b></th>
<th><b>Location</b></th>
<th><b>Distance</th>



</tr>

<%for(int i = 0; i < searchingd.size(); i++) {
	
	
   

	
	

%>
  
  <tr bgcolor="#DEB887">    
<td><%=searchingd.get(i).getName()%></td>
<td><%=searchingd.get(i).getStreetsize()%></td>
<td><%=searchingd.get(i).getPaymentMethod()%></td>
<td><%=searchingd.get(i).getLocation()%></td>
<td><%=searchingd.get(i).getDistance()%></td>


</tr>
<%} %>
</table>
</div>
</center>
</body>
</html>