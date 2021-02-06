<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
				line-height: 175%;
	}
			
body {
              background-image: url("img/b.jpeg");
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
		
		
			
                }
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  font-family:sans-serif;
  text-decoration: none;
  display: inline-block;
  font-size: 20px;
  margin: 4px 2px;
  cursor: pointer;
  height:50px;
}

 #head2{
 font-family: cursive;
 color:black;
 font-size:50px;

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
<h2 id="head2" class="head2" align="center"><font><strong>Buy Items</strong></font></h2>
<br><br><br>


<div id="id01" class="modal">
<div class="search">
<form method="post" class="modal-content animate" action="searchbuy"><input type="search" name="search" placeholder="Search.." ><input type="submit" value="search"></form></div>

<center>

<div class="container" style="background-color:#f1f1f1; width:80% ;length:80%;">
<table   class="table table-bordered table-bordered-custom" align="center" cellpadding="5"  border="0">

<tr bgcolor="white">

<th><b>Buy_ID</b></th>
<th><b>price</b></th>
<th><b>color</b></th>
<th><b>customer_ID</b></th>
<th><b>Item_name</th>




</tr>
<%
try{ 
	
connection = Db_connection.getConnection();


String  sql1= "select * from buying";

preparedStatement =connection.prepareStatement(sql1);

res  = preparedStatement.executeQuery();

while(res.next()){

%>

<tr bgcolor="#A2D9CE  ">


<td><%=res.getInt("Buy_ID") %></td>
<td><%=res.getDouble("price") %></td>
<td><%=res.getString("color") %></td>
<td><%=res.getInt("customer_ID") %></td>
<td><%=res.getString("item_name") %></td>
<td>

  <center>
  <form  action="Update_buying" method="post">
    
    
  
      <input type="number" step ="1" name="Buy_ID"  value="<%=res.getInt("Buy_ID") %>"  required>
     
      <input type="number" step ="0.01" name="price" value="<%=res.getDouble("price") %>" required>
                        
    
      <input type="text"  name="colour"  value="<%=res.getString("color") %>" required>  
      
                      
       <input type="number" step ="1 "  name ="customer_id" value="<%=res.getInt("customer_ID") %>" required>
      
      <input type="text"  name ="itemName" value="<%=res.getString("item_name") %>" required>
        
      <td><button type="submit">Update</button></td>
      
   
  </form>

</center>
                        
 <form method="post" action="Delete_buying" >
<input type="number" step="1"  hidden required name="buy_id" value="<%=res.getInt("Buy_ID") %>">

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
 </div>
 </center>

<form method="post" action="home.jsp"> 
<button class="button">Back To Home</button>
</form>
</center>

    
  </form>    
      <form method="post" action="ppdf_genM">
      <button type ="submit" >convert pdf</button></form> 
</body></html>