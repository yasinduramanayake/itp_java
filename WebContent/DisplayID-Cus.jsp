<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

.dropdown-content {
  display: none;
  position: absolute;
  background-color: white;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: grey;
}

.dropdown:hover .dropdown-content {
  display: block;
  
}
.dropdown:hover {
  background-color: black;
}
.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: transparent;
  font-family: inherit;
  margin: 0;
  
}
body{
 background-image:url(images/homeingedit.jpg);
 background-repeat: no-repeat;
 background-size: 130%;
}
* {box-sizing: border-box;}

.mySlides {display: none;}
.mySlides1 {display: none;}
img {vertical-align: middle;
width:50%;}

 
body{
background-color:#829cd0;}
/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}
.slideshow-container1 {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

 

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}
.text1{
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}
 

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}
.numbertext1 {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

 

/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}
.dot1{
   
     height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}
 

.active {
  background-color: #717171;
}
.active1 {
  background-color: #717171;
}
 

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}
.fade1 {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

 

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

 

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

 @-webkit-keyframes fade1 {
  from {opacity: .4} 
  to {opacity: 1}
}

 

@keyframes fade1 {
  from {opacity: .4} 
  to {opacity: 1}
}
 

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
  
}
/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text1 {font-size: 11px}
  }
h1{
color:grey;
}


body{
background-color:white;
color:grey;
}
h3{
color:white;

}
.column {
  float: left;
  width:20%;
  padding: 10px;
}
* {
   box-sizing: border-box;
}

/* Clear floats after image containers */


.eve{
background-color:white;
}
* {
  box-sizing: border-box
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
   background-color: transparent;
}

li {
background-color: transparent;
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  color: lightgrey;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
  border-radius: 12px;
}

button:hover {
  opacity: 0.8;
}

</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%String uidnew = (String)request.getAttribute("newUser");%>
<center>
<br><br><br>
<h1 style="color:white;">Successfully Registered!</h1>
<h1  style="color:white;">Your ID is = <%=uidnew %></h1>

<form action="Login.jsp">
<Button type="submit" style="width:30%;" onclick="myFunction()">Login</Button>
</form>
</center>
<script>
function myFunction() {
  var txt;
  if (confirm("Save the id")) {
    txt = "You pressed OK!";
  } else {
    txt = "You pressed Cancel!";
  }
  document.getElementById("demo").innerHTML = txt;
}
</script>
</body>
</html>