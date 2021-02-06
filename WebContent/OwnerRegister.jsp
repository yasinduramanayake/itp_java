<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
body{
				line-height: 80%;
				}
			
	body {
            background-image: url("images/UFI96SASB_G.jpg"); 
		    background-repeat:no-repeat;
		    background-attachment:fixed;
			background-size:cover;
			background-size:100% 100%;
			font-family:sans-serif;
			font-size:15px;
			color:black;
			opacity: 0.8;
			
                }	
#name ,#Age,#Email,#contactNum,#Address,#WorkingExperience,#PASSWORD,#retypePASSWORD{
display: block; 
box-sizing: border-box; 
margin-bottom: 20px;
 padding: 4px; 
 width: 350px; 
 height: 32px;
border:  1px solid #AAA;
font-family: 'Roboto', sans-serif; 
font-weight: 0; 
font-size: 15px;
transition: 0.1s ease;

}
#button{
  margin-top: 10px; width: 250px; height: 40px; background:black; border: none; border-radius: 8px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}
.button{
  margin-top: 10px; width: 200px; height: 32px; background:black; border: none; border-radius: 16px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}
</style>
 

</head>
<body>

    <form method="post" action="InsertDetails" >
    <div
			style="position: relative; margin: 5% auto; width: 600px; height: 800px; background: rgb(240, 231, 231); border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
			
			
   
			
        <center><table >
         <tr>
         <br><br>
         <br>
          <h1 align="center">Registration</h1>
         <td ></td>
         <td>Name with initials<input type="text" name="Name" id ="name"required><br></td>
         </tr>
          <tr>
         <td></td>
         <td>Age<input type="number" step="1" name="Age" id="Age"required><br></td>
         </tr>
         <tr>
         <td></td>
         <td>Email<input type="email" name="Email" id="Email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="please enter valid email Address" required><br></td>
         </tr>
          <tr>
         <td></td>
         <td>Contact number<input type="number" name="contactNum" id="contactNum" title="please enter valid contact Number" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"required><br></td>
         </tr>
         <tr>
         <td></td>
         <td>Address<input type="text" name="address" id="Address"  required><br></td>
         </tr>
          <tr>
         <td></td>
         <td>Working Experience<input type="text" name="WorkingExperience" id="WorkingExperience"  required><br></td>
         </tr>
         <tr>
         <td></td>
         <td>Password<input type="password" name="PASSWORD" id="PASSWORD" title="Password must contain at least 6 characters, including UPPER/lowercase and numbers."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required><br></td>
         </tr>
         
         <tr>
         <td></td>
         <td>Confirm password<input type="password" name="retypePASSWORD" id="retypePASSWORD"title="Please enter the same Password as above."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required><br></td>
         </tr>
        
         <td>
         <td>
        <center>
       <input type="submit" value="Register" id ="button" ></input> 
       <input type="button" value="demo" id="button" onclick="demo1()"></input> 
         </center>
        
         </td>
         </tr>
        </table></center>
       </div>
       </div>
    </form>
</body>
<script type="text/javascript">
function demo1(){
	document.getElementById("name").value="Prabuddya fernando";
	document.getElementById("Age").value="22";
	document.getElementById("Email").value="sasa@gmail.com";
	document.getElementById("contactNum").value="0775360003";
	document.getElementById("Address").value="colombo";
	document.getElementById("WorkingExperience").value="4 years experience in this field";
	document.getElementById("PASSWORD").value="Sammani.123";
	document.getElementById("retypePASSWORD").value="Sammani.123";
	
}

</script>
</html>