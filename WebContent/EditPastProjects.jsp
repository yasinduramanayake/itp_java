<%@page import="java.sql.Blob"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#proect_ID ,#Type,#Description,#search{
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
#mySearch {
  width: 100%;
  font-size: 18px;
  padding: 11px;
  width: 600px;
  border: 1px solid #ddd;
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
                #h2{
                font-color:rgb(60, 60, 60);
                }
#button{
  margin-top: 10px; width: 120px; height: 32px; background:white; border: none; border-radius: 2px; color: black; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}
</style>
</head>
<body>
<h2 align="center" id="h2"><font><strong>All the Past Projects</strong></font></h2>

<form action="SearchPastproject" method= "post">
 <input type="text" name="search" id="mySearch"  placeholder="Search.." >
 <button type ="submit"  id="button" value="Search">Search</button>
 </form>
 
 <%@page import="java.sql.ResultSet"%>
 <%@page import="java.sql.PreparedStatement"%>
 <%@page import="java.sql.Connection"%>
 <%@page import="Db.Db_connection"%>
 <%@page import= "java.io.File"%>
<%
Connection connection;
 
PreparedStatement preparedStatement;
	
 ResultSet res;
%>

<%
try{ 
connection =Db_connection.getConnection();


String  sql1= "select * from pastproject ";

preparedStatement =connection.prepareStatement(sql1);




res  = preparedStatement.executeQuery();

while(res.next()){

%>

<div style="position: relative; margin: 5% auto; width: 600px; height: 400px; background: black; border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
<td>
<B>
<center>
<table>
 <table>
</div>

	<tr>
	<div style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
	<td></td>
	</tr>
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
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Image :</b><td><img alt="img" style="width: 200px;" src="<%=res.getString("image")%>"/></td></td>
</tr>
</table>
</div>

<% 
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<script type="text/javascript">
		document.getElementById('itemImage').onchange = function() {
			var file = document.getElementById('itemImage').files[0];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function() {
				//console.log(reader.result);
				document.getElementById('itemImageB64').value = reader.result;
			};
			reader.onerror = function(error) {
				console.log('Error: ', error);
			};
		};
	</script>
</body>
</html>