<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}


@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
body{
 background-image:url("file:///D:/shopping/WebContent/WEB-INF/lib/img/back.jpeg");
 background-size: 100%;
 }

 #head1{
 font-family: cursive;
 color:white;
 }
  #head2{
 font-family: cursive;
 color:white;
 }
  #para1{
 color:white;
 }
</style>
</head>
<body>

<h2 id="head2">Add To Cart</h2>
<div class="container">
  <form method="post" action="Update_cart">
  	
  <div class="row"><div class="col-25"><label for="pay_id">Pay ID</label></div><div class="col-75"><input type="text" name="pay_id"></div></div>
  <div class="row"><div class="col-25"><label for="price">Price</label></div><div class="col-75"><input type="text" name="price"></div></div>
  <div class="row"><div class="col-25"><label for="colour">Colour</label></div><div class="col-75"><input type="text" name="colours"></div></div>
  <div class="row"><div class="col-25"><label for="quantity">Quantity</label></div><div class="col-75"><input type="text" name="quantity"></div></div>
  <div class="row"><div class="col-25"><label for="cus_id">Customer ID</label></div><div class="col-75"><input type="text" name="cus_id"></div></div>
  <div class="row"><div class="col-25"><label for="cart_id">Cart ID</label></div><div class="col-75"><input type="text" name="cart_id"></div></div>
 <div class="row"></div><input type="submit" value="Add To Cart"></div>
  </form>


</body>
</html>