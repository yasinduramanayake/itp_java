<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
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
 background-size: 130% ;
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
  to {opacity: 8}
}

 

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 8}
}

 @-webkit-keyframes fade1 {
  from {opacity: .4} 
  to {opacity: 8}
}

 

@keyframes fade1 {
  from {opacity: .4} 
  to {opacity: 8}
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

	 <link rel="stylesheet" href="Footer.css">


<title>M & N Cretaions</title>
</head>
<body>
<ul>
  <li><a style="background-color: grey;"   href="Home.jsp">Home</a></li>
  
<li><a href="OwnerRetriew.jsp">Owner profile</a></li>

  <li><a href="Registeration.jsp">Register</a></li>
  <li><a href="Login.jsp">Login</a></li>
   <li><div class="dropdown">
  <button class="dropbtn">Online_Store</button>
  <div class="dropdown-content">
   <a href="DisplayHouseHoldFurnitures.jsp">Household Furniture</a>
    <a href="DisplayHotelFurniture.jsp">Hotel Furniture</a>
    <a href="DisplayOfficeFurnitures.jsp">Office Furniture</a>
  </div>
</div></li>
  
  <li><a href="">Events</a></li>
  
  <li><a href="PastPeoject.jsp">Company_Projects</a></li>
  
  <li><a href="">Discounts</a></li>
  
 

    
</ul>
<br><br><br><br><br><br>
<center>
<div class="slideshow-container">

 

<div class="mySlides fade">
  <div class="numbertext"></div>
  <img src="images/M&MP.jpg" style="width:65% ;length:40% ;">

</div>

 

<div class="mySlides fade">
  <div class="numbertext"></div>
  <img src="images/lassanai.jpg" style="width:65%;length:40%;">

</div>

 



 

</div>
<br>

 

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  
</div>
</center>



<script>
var slideIndex = 0;
showSlides();

 

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 10000); // Change image every 2 seconds
}

var slideIndex1 = 0;
showSlides1();

 
function showSlides1() {
  var j;
  var slides = document.getElementsByClassName("mySlides1");
  var dots = document.getElementsByClassName("dot1");
  for (j = 0; j< slides.length; j++) {
    slides[j].style.display = "none";  
  }
  slideIndex1++;
  if (slideIndex1 > slides.length) {slideIndex1 = 1}    
  for (j = 0; j < dots.length; j++) {
    dots[j].className = dots[j].className.replace(" active1", "");
  }
  slides[slideIndex1-1].style.display = "block";  
  dots[slideIndex1-1].className += " active1";
  setTimeout(showSlides1, 2000); // Change image every 2 seconds
}
</script>

  <br><br><br><br><br><br><br><br><br><br><br><br>  <br><br><br><br><br><br><br><br><br><br><br><br>

<div class="footer">
  <div class="inner-footer">

<!--  for company name and description -->
    <div class="footer-items">
      <h2 style="font-style:italic;color:#D1A700">Maduranga & Mandinu FURNITURES </h1>
      <h3 style="font-style:italic;">We are the largest one-stop<br> shop for<br> total customized interior<br> solutions and<br> furniture requirements in Sri-Lanka for <br>all corporate and residential interior<br> needs.</h3>
    </div>

<!--  for quick links  -->
    <div class="footer-items">
      <h3>Quick Links</h3>
      <div class="border1"></div><br> <!--for the underline -->
        <ul>
          <a href="#"><li style="color:white;">Home</li></a><br><br>
          <a href="#"><li style="color:white;">Online Store</li></a><br><br>
          <a href="#"><li style="color:white;">Company Projects</li></a><br><br>
          <a href="#"><li style="color:white;">Advertiesments</li></a><br><br>
        </ul>
    </div>

<!--  for some other links -->
    <div class="footer-items">
      <h3>Selling Catogories</h3>
      <div class="border1"></div><br>  <!--for the underline -->
        <ul>
          <a href="#"><li style="color:white;">Hotel Furnitures</li></a><br><br>
          <a href="#"><li style="color:white;">House Hold Furnitures</li></a><br><br>
          <a href="#"><li style="color:white;">Office Furniture</li></a><br><br>
          <a href="#"><li style="color:white;">Wooden & Decking</li></a><br><br>
        </ul>
    </div>

<!--  for contact us info -->
    <div class="footer-items">
      <h3>Contact us</h3>
      <div class="border1"></div><br>
        <ul>
          <li><i class="fa fa-map-marker" aria-hidden="true"></i><b>Address:</b><br>191/5A, Silverin Park ,Maharekma Road,<br> Mawala, Wadduwa </li><br><br>
          <br><br><br><li><i class="fa fa-phone" aria-hidden="true"></i><b>Tel:</b> 0773057016-0763163972</li><br><br>
          <li><i class="fa fa-envelope" aria-hidden="true"></i><b>E-mail:</b> madhurangakldc@gmail.com </li><br><br>
        </ul> 
      
<!--   for social links -->
        <div class="social-media">
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="#"><i class="fab fa-facebook"></i></a>
          <a href="#"><i class="fab fa-google-plus-square"></i></a>
        </div> 
    </div>
  </div>
  
<!--   Footer Bottom start  -->
  <div class="footer-bottom">
    All right recerved
  </div>
</div>
</body>
</body>
</html> 




