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

<div class="topnav">

  <form action="Searchv_servelet" method=post >
  <input type="search" name="searchv" placeholder="Enter price..">
  <input type="submit" >
 </form>
  
</div>

<div style="padding-left:16px">
 
<center>

<div class="container" style="background-color:#f1f1f1; width:80% ;length:80%;">
<table   class="table table-bordered table-bordered-custom" align="center" width="100%" cellpadding="5"  border="0">

<tr bgcolor="white">

<th><b>Price</b></th>
<th><b>Quantity</b></th>
<th><b>Email</b>






</tr>

<%
try{ 
connection =Db_connection.getConnection();


String  sql1= "select * from ordering";

preparedStatement =connection.prepareStatement(sql1);




res  = preparedStatement.executeQuery();

while(res.next()){

%>

<tr bgcolor="#A2D9CE">


<td><%=res.getString("Price") %></td>
<td><%=res.getInt("Quantity") %></td>
<td><%=res.getString("Email") %></td>



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



<center>
<form method="post" action="pdf_genV"><input type="submit" value="genarate pdf" id="four"></center>
</form>




</body>
</html>