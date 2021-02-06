<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <style>
 
	
			
	body {
              background-image: url("images/image2.jpeg");
  
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:20px;
			color:black;
                }	
   
   .button{
		
		background-color: red;
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
			border: 2px solid red;
			border-radius: 12px;
			background:rgba(0,0,0,0.9);
			
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
	<center><h1 style = "font-family: Arial, Helvetica, sans-serif;
				        color:red;
				        font-size: 3.0em;
				        text-shadow: 3px 2px #d9d9d9;">Contac Us</h1></center>
	<hr>
			<center>
			 <form method ="post" action="DeletePaymentServlet">
	  <table><br><br><br>
				
				
					
					<tr>
				
						<td><input name="P_id" type = "text" id = "fname" placeholder = "Payment ID" required></td>
					</tr>
					
					
					
					
					
					</table>
				<br>
						<input type = "checkbox" value = "condition" id = "tick" onclick = "check()"> Are you fill all details correctly? 
						<br><br>
			
						<input type="submit" value="DELETE" id ="button"class="button" disabled><br><br>
			
			</form>
			
		</table><br><br>
	
	     </center>	  
			
        
</body>
</html>

