<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Registration</title>
<style>


body{

 background-image:url(images/homeingedit.jpg);
 background-repeat: no-repeat;
 background-size: 130%;
}

width: 50%;
position: absolute;
left: 0px;
height: 100%;
}


/* Split the screen in half */
.split {
  height: 100%;
  width: 50%;
  position: fixed;
  z-index: 1;
  top: 0;
  overflow-x: hidden;
  padding-top: 20px;
}

/* Control the left side */
.left {
  left: 0;
  background-color:#708090;
}

/* Control the right side */
.right {
  right: 0;
  background-color:#C0C0C0;
}

/* If you want the content centered horizontally and vertically */
.centered {
  position: absolute;
  
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
}
input[type=number], input[type=password],input[type=text] {
  width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 60%;
  border-radius: 12px;
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 20px;
   border-radius: 15px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
 
  }
  
#button{
  margin-top: 10px; width: 250px; height: 40px; background:black; border: none; border-radius: 8px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;
}


</style>

</head>
<body >
<br><br>
<center>
		 
     <div class="container" style="background-color:#f1f1f1;background-color: rgba(255,255,255,0.5); width:50% ;height:50%;">
				 
	<form method="post" action="CustomerInsert" >
		

         
          <h1><b>Register Here!</b></h1>
           
           
 <br>
 <B>
          
         <label for="uname"><b>Enter Name with initials:</b></label><br><input type="text" name="Name" id ="Name" placeholder="Name with initials" required><br><br>
         
         <label for="uname"><b>Enter Address:</b></label><br><input type="text" name="Address"  id="Address" placeholder="Address"required><br><br>
        
        <label for="uname"><b>Enter Contact number:</b></label><br><input type="number" name="contactNum" placeholder="Contact number" id="contactNum"pattern="[0-9]{10}" title="invalid contact number" required><br> <br>        
          
        
         <label for="uname"><b>Enter NIC:</b></label><br><input type="text" name="NIC" placeholder="NIC" id ="NIC"pattern = "[0-9]{9}[V|v]" title="invalid NIC number" required>     <br> <br>  
         
        
         <label for="uname"><b>Enter Email:</b></label><br><input type="text" name="Email" placeholder="Email" id = "Email" title="please enter valid email Address" required>  <br>  <br>     
 
        <label for="uname"><b>Enter Password:</b></label><br><input type="password" name="PASSWORD" placeholder="Password" id ="PASSWORD" title="Password must contain at least 6 characters, including UPPER/lowercase and numbers."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required > <br><br>        
        
      
        <br> <label for="uname"><b>Enter Confirm password:</b></label><br><input type="password" name="retypePASSWORD" placeholder="Confirm password" id="retypePASSWORD" title="Please enter the same Password as above."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"required><br><br>
    
           
         <input type = "checkbox" value = "condition" id = "tick" ><B> I do not have an account? </B><br>
        
        
         <span id='message'></span> 
         <br>
       
         <button type="submit" id="myBtn" onclick="myFunction2()" >Register</button>
  
         
       
        
       
       </div>
       </div>
    </form>
    </center>
    
    <script>
    function myFunction2() {

    	alert("Check your Email!");
    }
    </script>
  
         
</body>

</html>