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
input[type=text],input[type=password] {
  width: 70%;
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
  width: 70%;
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
<title>Reset Password</title>
<link rel="stylesheet" href="Footer.css">
</head>
<body>

  

<div class="split right">
  <div class="centered">
  

 <br><br>
<center>

<div class="container" style="background-color:#f1f1f1;background-color: rgba(255,255,255,0.5); width:150% ;length:100%; ">

<h1>Reset Password</h1>

<p>You can reset your Password here.</p>


<form method="post" action="Reset_servelet">
                
                
                  
                       <b>Enter  Verification code:</b><br>
                        <input type="text"  step="1" name="code" placeholder="Enter Verification code" required>
                        <br/><br>
                      
                      <b>Enter New Password:</b><br>
                        <input type="password" name="newp" placeholder="Enter new Password" id="password"  title="Password must contain at least 6 characters, including UPPER/lowercase and numbers."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" onkeyup='check();' required><br><br>
                        
                        <b>Confirm New Password:</b><br>
                        <input type="password" name="confirmp" placeholder="Confirm Password" id="confirm_password" title="Password must contain at least 6 characters, including UPPER/lowercase and numbers."pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"  onkeyup='check();' required> <br>
                        <span id='message'></span>  
                        <br><br>
                        
                        
                        
                         
                        <button type="submit" name="Submit" id="myBtn">Reset Password</button>
                        </div>
                        
                        
                        
                          
  </form>
  
</div>
</div>
 </center>
     <script> 
     var check = function() {
    	  if (document.getElementById('password').value ==
    	    document.getElementById('confirm_password').value) {
    	    document.getElementById('message').style.color = 'green';
    	    document.getElementById('message').innerHTML = 'Password matching';
    	    document.getElementById("myBtn").disabled = false;
    	  } else {
    	    document.getElementById('message').style.color = 'red';
    	    document.getElementById('message').innerHTML = 'Passowrd not matching';
    	    document.getElementById("myBtn").disabled = true;
    	  }
    	}
  
        </script>    
        
                
</body>
</html>