<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<style>
form.ex text {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}
</style>

 
<h1><center>Transaction Details</center></h1>
    <br>




<head>
<meta charset="ISO-8859-1">


<%@page import="java.util.ArrayList"%>
<%@page import="Model.Payment"%>


<%Object[] row = new Object[5];%>


<% ArrayList<Payment> searchingpayments =(ArrayList<Payment>)request.getAttribute("Arraypay1234"); %>


<h2 align="center"><font><strong>Payments</strong></font></h2>
<center>
<div class="container" style="background-color:#f1f1f1; width:60% ;length:80%;">
<table   class="table table-bordered table-bordered-custom" align="center" cellpadding="4"  border="0">

<tr bgcolor="white">



<%for(int i = 0; i < searchingpayments.size(); i++) {
	
	
   

	
	
%>
  
  <tr bgcolor="#DEB887">  

<tr>
<div style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">


<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Email</b><td><%=searchingpayments.get(i).getEmail() %></td></td>
</tr>

<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Phone_Number</b><td><%=searchingpayments.get(i).getPhoneNo()%></td></td>
</tr>

<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Card Name</b><td><%=searchingpayments.get(i).getCrdName()%></td></td>
</tr>


<div>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Amount</b><td><%=searchingpayments.get(i). getAmount()%></td></td>
</tr></div>

<br><br>

</tr>

 
  </form>
</div>
</center>

</td>
</tr>
<%} %>
</table>
</div>
</center>

</body>
</html>
    