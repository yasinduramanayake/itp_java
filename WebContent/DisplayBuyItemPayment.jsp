<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body{
 background-image:url("images/image2.jpeg");
 background-size: 100%;}
 
  input[type=submit] {
  width: 25%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;}
 
</style>
<meta charset="ISO-8859-1">

</head>
<body>


<br>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Db.Db_connection"%>
<%

Connection connection;

PreparedStatement preparedStatement;

	
 ResultSet res;
%>
<h2 align="center"><font><strong>PAYMENT DETAILS DISPLAY</strong></font></h2>
 <div 
 style="position: relative; margin: 5% auto; width: 600px; height: 700px; background: rgb(240, 231, 231); border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
	
<table align="center">

</div>

<%
try{ 
connection =Db_connection.getConnection();


String  sql1= "select * from buy_pay where Cus_id=?";

preparedStatement =connection.prepareStatement(sql1);

preparedStatement.setInt(1,(Integer)session.getAttribute("UID"));

res  = preparedStatement.executeQuery();

while(res.next()){

%>
<tr>
<div style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">


<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Email</b><td><%=res.getString("Email") %></td></td>
</tr>

<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Phone_Number</b><td><%=res.getInt("Phone_No") %></td></td>
</tr>

<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Card Name</b><td><%=res.getString("Card_Name") %></td></td>
</tr>

<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Credit Card Number</b><td><%=res.getInt("credit_card_ID") %></td></td>
</tr>

<div>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Amount</b><td><%=res.getDouble("Amount") %></td></td>
</tr></div>

<br><br>

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
<form method="post" action="UpdateBuyItemPayment.jsp"> 

                 <input type="submit" value="Update" class="btn btn-primary">
                 </form>
                 <form method="post" action="DeleteBuyItemPayment.jsp"> 
                  <input type="submit" value="Delete Information " class="btn btn-primary">
                  </form>
                  
                  <form>
                 <input type="submit" value="Next" class="btn btn-primary">
                 </form>
                 
              
</center>

<form action="Payment_sum_amount" method="post">
<button type="submit">Calculate Full Payment Amount till now</button>
</form>

</body>
</html>
                 
    