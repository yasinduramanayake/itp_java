<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner Profile</title>
 <style>
#name ,#Age,#Email,#contactNum,#Address,#WorkingExperience,#PASSWORD,#retypePASSWORD{
display: block; 
box-sizing: border-box; 
margin-bottom: 20px;
 padding: 4px; width: 220px; 
 height: 32px;
  border:  1px solid #AAA;
font-family: 'Roboto', sans-serif; 
font-weight: 400; 
font-size: 15px;
transition: 0.2s ease;

}
body{
		line-height: 175%;
				}
			
	body {
              background-image: url("images/UFI96SASB_G.jpg");
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:white;
			opacity: 0.8;
			
                }	
#button{
  margin-top: 10px; width: 120px; height: 32px; background:rgb(60, 60, 60); border: none; border-radius: 2px; color: white;display: inline-block; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
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
<h2 align="center"><font><strong>Owner Profile</strong></font></h2>
 <div 
 style="position: relative; margin: 5% auto; width: 600px; height: 500px; background: black; border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">		
<table align="center">
</div>

<%
try{ 
connection =Db_connection.getConnection();
String  sql1= "select * from owner where UID = ? ";
preparedStatement =connection.prepareStatement(sql1);

preparedStatement.setInt(1,(Integer)session.getAttribute("UID"));

res  = preparedStatement.executeQuery();

while(res.next()){

%>
<tr>
<div style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<div>
<tr>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Name</b><td><%=res.getString("Name") %></td></td>
</tr>
<tr>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Age</b><td><%=res.getInt("Age") %></td></td>
</tr>
<tr>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Email</b><td><%=res.getString("email") %></td></td>
</tr>
<tr>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Contact Number</b><td><%=res.getInt("contactNum") %></td></td>
</tr>
<tr>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Address</b><td><%=res.getString("address") %></td></td>
</tr>
<tr>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Working Experience</b><td><%=res.getString("WorkingExperience") %></td>
</tr>

</div>
</div>
<% 
}
connection.close();
} 
catch (Exception e)
{
e.printStackTrace();
}
%>
</table>
<br>
<center>
<form method="post" action="AdminDashboard.jsp">
<input type="submit"  name="botton" id="button"  value="back" allign="right"></form>
<form method="post" action="updateOwner.jsp">
<input type="submit"  name="botton" id="button"  value="Edit" allign="right"></form>
</center>

</body>
</html>