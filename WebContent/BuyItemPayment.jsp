<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

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
 color:lightgrey;
}
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

 background-image:url(images/Backgroun@2.jpg);
 background-repeat: no-repeat;
 background-size:  100%;


}
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */


/* Set a style for all buttons */
button {
 background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
 border-radius: 12px;
}

button:hover {
  opacity: 0.8;
}


/* Center the image and position the close button */





/* The Close Button (x) */



.search{

float: right;
 
  border: 3px  ; 
  padding: 10px;

}
.sBot{
float: right;
   width: 200px;
 

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
  }
}
.se{

float: right;
 
  border: 3px  ; 
  padding: 10px;
  background-color: transparent;

}
.crt{
float: right;
}

 #he{
 font-family: cursive;
 color:#F6B88B;}
  #two{font-size:20px;
  
  background-color: #c39b77;
  box-shadow: 0 5px #666;
  font-family: cursive;
}
#f{
font-family: cursive;
color:#9b5c45;
font-size: 20px;}

input[type=text], select {
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=email], select {
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;}
  
  input[type=password], select {
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;}

  input[type=number], select {
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;}
  
  input[type=date], select {
  width: 35%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;}
  
  input[type=submit] {
  width: 15%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;}
  
 h1 {
  color: red;}

h2 {
  color: pink;}

p {
  color: white;}
  
.mal{
  color: white;}
  
</style>



<meta charset="ISO-8859-1">

</head>
<body>

<br><br><br>
<ul>
  <li><a href="">Home</a></li>
   <li> <div class="dropdown">
   <button class="dropbtn">Advertiesment</button>
  <div class="dropdown-content">
    <a href="">Event</a>
    <a href="">Discount</a>
   
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">Store</button>
  <div class="dropdown-content">
    <a href="">Household Furniture</a>
    <a href="">Hotel Furniture</a>
    <a href="">Office Furniture</a>
  </div>
</div></li>
  <li><div class="dropdown">
  <button class="dropbtn">Project</button>
  <div class="dropdown-content">
    <a href="">Civil Construction</a>
    <a href="">Designing</a>
    <a href="">Plumbing workers</a>
  </div>
</div></li>
  <li><a href="">OwnerProfile</a></li>
   <li><a href="">Feedback</a></li>
   <li><a href="">Aboutus</a></li>
    
</ul>





<center>

<h2 class="form-title">Personal Details</h>
	  <div class="form-group">
	  <form method ="post" action="BuyItemServlet">
	  
	  						
                             <div class="form-group">
                                <label for="email"><i class="fas fa-envelope"></i></label>
                                <input type="email" name="email" id="pass" placeholder="Email Address" required="required" />
                            </div><br>
                               <div class="form-group">
                                <label for="phone"><i class="fas fa-phone"></i></label>
                                <input type="number" name="phone" id="pass2" placeholder="Phone Number " required="required" />
                            </div><br>
                            
 							<div class="mal">
 							 <p>Payment Method</p>
  							 <input type="radio" id="cd" name="card" value="Credit/Debit Card">
 							 <label for="card">Credit/Debit Card</label><br>                        
                            </div>
                            
<h2 class="form-title">Billing Details</h2>                            
                            
                              <div class="form-group">
                              <label for="name"><i class="fas fa-file-signature"></i></label>
                              <input type="text" name="cusName" id="crd" placeholder="Name On Card" required="required" />
                            </div><br>
							 <div class="row" id="buttons">
	                            <label for="no"><i class="far fa-credit-card"></i></label>
                                <input type="number" step="1" name="cardNo" id="name" placeholder="Credit Card Number" required="required"/>
                            </div><br>

                            <div class="form-group">
                                <label for="date"><i class="fas fa-table"></i></label>
                                <input type="date" name="expiryDate" id="re_pass"  placeholder="Expiration Date" required="required" />
                            </div><br>
                           <div class="row" id="buttons">
	                            <label for="no"><i class="far fa-ccredit-card"></i></label>
                                <input type="number" step="1" name="cvv" id="name2" placeholder="CVV" required="required"/>
                            </div><br>
                          
                            <div class="form-group">
                                <label for="amount"><i class="fas fa-dollar-sign"></i></label>
                                <input type="number"  readonly value="<%=request.getAttribute("pricebuy")%>" step="0.01" name="amount" id="price" placeholder="Amount" required="required"  />
                            </div><br>
                            
                            <div class="form-group">
                                <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                                <label style="color:white" for="agree-term" class="label-agree-term"><span><span></span></span>I agree all
                                    statements in the services <a href="#" class="term-service">t</a></label>
                            </div><br>
                         
<input type="submit" value="Pay" id="two"><br></form>
<input type="submit" value="Auto fill"  onclick="save()" id="two">
	 </div>
</center>
 <script> 
 function save(){
	 document.getElementById('pass2').value = '0713453110';
 document.getElementById('pass').value = 'sithmiganepola@gmail.com';
    document.getElementById('crd').value = 'Sithmi';
    document.getElementById('name').value = '1345887877';
    document.getElementById('re_pass').value = '04.10.2030';
    document.getElementById('name2').value = '5678999';
 }
  </script>
</body>
</html>



