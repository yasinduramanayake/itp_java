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
		
		background-color: #5cc639;
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
			background:rgba(0,0,0,0.8);
			
           }

	
	#ItemId{
			width:300px;
			height:35px;
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
				        color:black;
				        font-size: 3.0em;
				        text-shadow: 5px 3px #ffffcc;">Insert Item Details</h1></center>
	<hr>
		
			<form action="reg" method="POST"><center><table><br><br><br>
				
				
					
					
					<tr>
					    <td><input name="ItemId" type = "text" id = "ItemId" placeholder = "Enter Item Id" required></td> 	
					</tr>
												
					
					</table>
				
						<input type = "checkbox" value = "condition" id = "tick" onclick = "check()"> Are you sure, You want to delete this Item?  
						<br><br>
			
						<input type="submit" value="DELETE" id ="button"class="button" disabled><br><br>
			
			</form>
		</table></center><br><br>
	
	       
			
        
</body>
</html>