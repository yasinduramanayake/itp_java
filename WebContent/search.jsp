<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
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
                
#button
{
  margin-top: 10px; width: 120px; height: 32px; background:white; border: none; border-radius: 2px; color: black; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}	
 </style>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.PastProject"%>


<%Object[] row = new Object[5];%>


<% ArrayList<PastProject> search_project =(ArrayList<PastProject>)request.getAttribute("Array"); %>


<h2 align="center"><font><strong>Past Projects</strong></font></h2>





</tr>
  
<%for(int i = 0; i < search_project.size(); i++) {%>
<div style="position: relative; margin: 5% auto; width: 600px; height: 400px; background: black; border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
<td>
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
<b>Project Number :</b><td><%=search_project.get(i).getProect_ID()%></td></td>
</tr>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Type :</b><td><%=search_project.get(i).getDescription()%></td></td>
</tr>
<tr>
<td></td>
<td style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: noner-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;">
<b>Description :</b><td><%=search_project.get(i).getType()%></td></td>
</tr>
<tr>
<td></td>
<td>
<center>
<form method ="post" action="PastProjectDelete"><input type ="number" hidden step ="1"value="<%=search_project.get(i).getProect_ID()%>" name="proect_ID" id="proect_ID" readonly required >
<input type="submit"  value="Delete" id="button" ></a><br></td>
</form>

<td>
<form action ="UpdatePastprojects.jsp" method ="post">
<input type ="number" hidden step ="1"value="<%=search_project.get(i).getProect_ID()%>" name="proect_update_ID" id="proect_update_ID" readonly required >
<input type="submit"  value="Update" id="button" ></a>
</form>
</td>
</tr></center></div>
</table>
</table>

</center>
</td>
</div>
<% 
}
%>
</body>
</html>