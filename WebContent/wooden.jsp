><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
              background-image: url("images/unnamed.png");
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:white;
                }	
   
   #button{
		
		background-color: black;
		border-radius: 12px;
		cursor:pointer;
        border: none;
        color: white;
		padding: 10px 50px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
        margin: 10px 20px;
	}
	
	
	
	table {
			border-spacing: 40px;
			border: 2px solid ;
            border-radius: 12px;
			background:rgba(0,0,0,0.9);
			
           }

	

	#Type,#Description{
			width:300px;
			height:35px;
			border-radius: 6px;
			
			}
			
			
	#Description{
			width:300px;
			height:150px;
			border-radius: 6px;
			
		}	

			{
			font-family:#ff0000;
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

 <div 
 >
			
		
<table align="center">

</div>
<h2 align="center"><font><strong>Wooden Floor</strong></font></h2>
 

<%
try{ 
connection =Db_connection.getConnection();


String  sql1= "select * from pastproject where Type= 'wooden floor' ";

preparedStatement =connection.prepareStatement(sql1);




res  = preparedStatement.executeQuery();

while(res.next()){

%>
<tr>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Project Number :</b><td><%=res.getInt("proect_ID") %></td></td>
</tr>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Type :</b><td><%=res.getString("Type") %></td></td>
</tr>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Description :</b><td><%=res.getString("Description") %></td></td>
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
<form method="post" action="PastPeoject.jsp"> 
<input type="submit"  name="botton" id="button"  value="back to home page" allign="right"></form>
</center>




</body>
</html>