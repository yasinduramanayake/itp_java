<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body{

 background-image:url(images/Background.jpeg);
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
  .cancelbtn {
     width: 100%;
      background-color: #111;
  }
}
.psw{
color:black;
}

</style>
<meta charset="ISO-8859-1">
<title>Login to m&m Furnitures</title>
</head>
<body>
<center>


                
                
                 
  


<div class="split right">
  <div class="centered">-
   <br><br>
  <center>
   <br><br><br><br>
     <div class="container" style="background-color:#f1f1f1; width:80% ;length:90%;">
  <h1>Login here</h1>
 <img src="images/PngItem_2005251.png" style="width:20% ;length:20% ;">
 <br><br>
 
 
 
    <form  method="post" action="Checkout_buying_servelet">
                        <div class="container">
                        
      <label for="uname"><b>UserID</b></label><br>
      <input type="number" step="1" placeholder="Enter UserID" name="ID" required style="  width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;"><br>

      <label for="psw"><b>Password</b></label><br>
      <input type="password" placeholder="Enter Password" name="PassWord" required style="  width: 60%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 12px;"><br>
      
       <label for="price"><b></b></label>
      <input type="number" step="0.01"  hidden value="<%=request.getAttribute("buy_mp")%>" name="priceb" required>
      
       <label for="colour"><b></b></label>
      <input type="text" step="1"  hidden  value="<%=request.getAttribute("buy_mc")%>" name="colorb" required>
      
       <label for="itemname"><b></b></label>
      <input type="text"  name="itemnameb" value="<%=request.getAttribute("buy_mi")%>" hidden required>
      
        
      <button type="submit">Login</button>
      
    <div class="psw"><a href="Registeration.jsp"><h4 style="color:black;background-color:#f1f1f1;">Dont't have an Account? Register Now!</h4></a></div>
      <div class="psw"><a href="Forgotton_password.jsp"><h4 style="color:black;background-color:#f1f1f1;">Forgot password?</h4></a></div>
   
  </form>
</div>


  </div>
</div>





</center>

</body>

</html>