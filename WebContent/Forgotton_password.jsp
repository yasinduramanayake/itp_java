<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
  background-color: 	#708090;
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
input[type=number], input[type=text],input[type=email] {
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
  .cancelbtn {
     width: 100%;
      background-color: #111;
  }
}

}
</style>
<meta charset="ISO-8859-1">
<title>Forgotton password</title>
</head>
<body>

 

<div class="split right">
  <div class="centered">
  

 <br><br>
<center>
<br><br><br><br>
<div class="container" style="background-color:#f1f1f1; width:80% ;length:80%;">

<h1> Forget password?</h1>
<img src="images/PngItem_5203913.png" style="width:20% ;length:20%;">
<p>Forgot your Passowrd?</p>


<form method="post" action="Forgotton_password_servelet">
                
                
                  
                        <b>Enter  User ID:</b><br>
                        <input type="number"  step="1" name="ID" placeholder="Enter ID" required>
                        <br/><br>
                      
                        <b>Enter Name:</b><br>
                        <input type="text" name="Name" placeholder="Enter Name" required><br><br>
                        
                        <b>Enter E-mail:</b><br>
                        <input type="email" name="Email" placeholder="Enter E-mail" required><br><br><br>
                        
                        
                         
                        <button type="submit" name="Submit"  onclick="myFunction()">Send verification code</button>
                        </div>
                        
                          
  </form>
</div>
</div>
                          </center>
                          <script>
function myFunction() {

	alert("Check your Email!");
}
</script>
                          
</body>
</html>