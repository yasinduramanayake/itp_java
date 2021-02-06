<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav input[type=text] {
  float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
}

@media screen and (max-width: 600px) {
  .topnav a, .topnav input[type=text] {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}
</style>

</head>
<body>



<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Db.Db_connection"%>
<%
Connection connection;
 
PreparedStatement preparedStatement;

	
 ResultSet res;
%>
<h2 align="center"><font><strong>Order Details</strong></font></h2>



<div style="padding-left:16px">
 
<center>

<div class="container" style="background-color:#f1f1f1; width:80% ;length:80%;">
<table   class="table table-bordered table-bordered-custom" align="center" cellpadding="5"  border="0">

<tr bgcolor="white">

<th><b>Price</b></th>
<th><b>Quantity</b></th>






</tr>

<%
try{ 
connection =Db_connection.getConnection();


String  sql1= "select * from ordering where CustomerID=?";

preparedStatement =connection.prepareStatement(sql1);

preparedStatement.setInt(1,(Integer)session.getAttribute("UID"));


res  = preparedStatement.executeQuery();

while(res.next()){

%>

<tr bgcolor="#A2D9CE">


<td><%=res.getString("Price") %></td>
<td><%=res.getInt("Quantity") %></td>


<td>

  <center>
  <form  action="updateServlet" method="post">
    
    
  
      <br><input type="number" step="1" id="f" hidden name="oid" value="<%=res.getInt("order_ID") %>" placeholder="order id"  required >

     
      <br><input type="number" step="1" id="f"  name="Quantity" value="<%=res.getInt("Quantity") %>" placeholder="Quantity" required >
                        
 
   
        
      <td><button type="submit">Update</button></td>
      
   

   
  </form>

</center>
                        
 <form method="post" action="deleteServlet">
<input type="number" id="f" name="oID" hidden placeholder="orderid" value="<%=res.getInt("order_ID") %>" required >


<td> <button type="submit">Delete</button></td>
</form>


</td>


</tr>


































<% 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<br><br><br>

Display Full Orders Amount(You have done till present):
<form method="post" action="Order_calculation_servelet">
<button type="submit">Display</button>
</form>




</body>
</html>