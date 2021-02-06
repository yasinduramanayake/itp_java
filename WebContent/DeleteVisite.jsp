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
              background-image: url("./images/back.jpeg");;
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:white;
                }	
   
   .button{
		
		background-color:#008000;
		border-radius: 12px;
		cursor:pointer;
        border: none;
        color: white;
		padding: 15px 60px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
        margin: 10px 20px;
	}
	
	
	
	table {
			border-spacing: 40px;
			border: 2px solid #008000;
border-radius: 12px;
			background:rgba(0,0,0,0.8);
			
           }

	#adress{
			width:300px;
			height:60px;
			border-radius: 6px;
			}

	#email,#mNo,#NIC,#fname{
			width:300px;
			height:35px;
			border-radius: 6px;
			
			}
			
			
	#message{
			width:300px;
			height:150px;
			border-radius: 6px;
			
		}	

			{
			font-family:#ff0000;
			}

   
   </style>
   
   <script>
   function check()
   {
	if(document.getElementById("tick").checked){
			document.getElementById("button").disabled = false;
	}
	
	else
	{
	document.getElementById("button").disabled = true;
	}
}
   </script>
</head>

<body><br><br>

		<%
			String Visite_Id = request.getParameter("visiteId");
			String CUstomer_Name = request.getParameter("fullname");
			String NIC_Number = request.getParameter("NIC");
			String Email_number = request.getParameter("Email");
			String Mobile_Number = request.getParameter("pNum");
			String Customer_Address = request.getParameter("adres");
			String Customer_message = request.getParameter("message");
			
		%>
		

	<center><h1 style = "font-family: Arial, Helvetica, sans-serif;
				        color:#008000;
				        font-size: 4.0em;
				        text-shadow: 5px 3px #ffffcc;">Contac Us</h1></center>
	<hr>
		
			<form action="deleteVisite" method="POST"><center><table><br><br><br>
				
				
					<tr>
						<td>Visite Id</td><td>:</td>
						<td><input name="visiteId" step="1" type = "number" id = "visiteId" value="<%= Visite_Id %>" ></td>
					</tr>
				
					
					</table>
				
						<input type = "checkbox" value = "condition" id = "tick" onclick = "check()"> Are You sure, You Want to Delete Your Account?  
						<br><br>
			
						<input type="submit" value="DELETE" id ="button"class="button" disabled><br><br>
			
			</form>
		</table><br><br>
        
</body>
</html>