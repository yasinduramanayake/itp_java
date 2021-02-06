<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body {
	background-image: url("./images/back.jpeg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	background-size: 100% 100%;
	font-family: sans-serif;
}

.loginBox {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 400px;
	height: 430px;
	padding: 80px 40px;
	box-sizing: border-box;
	background: rgba(0, 0, 0, 0.9);
}

h2 {
	margin: 0;
	padding: 0;
	text-align: center;
	color: #fff;
	font-size: 30px;
}

.loginBox p {
	padding: 0;
	margin: 0;
	color: #fff;
}

.loginBox input {
	width: 300px;
	margin-bottom: 20px;
}

.loginBox input[type="text"] {
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}

.loginBox input[type="submit"] {
	border: none;
	outline: none;
	height: 40px;
	color: #fff;
	background: #008000;
	border-radius: 20px;
}

.loginBox input[type="submit"]:hover {
	cursor: pointer;
	background: #ffc107;
	color: #000;
}

.user {
	width: 100px;
	height: 100px;
	border-radius: 50%;
	overflow: hidden;
	position: absolute;
	top: calc(-100px/ 2);
	left: calc(50% - 50px);
}
</style>


</head>

<body>
	<div class="loginBox">

		<img src="./images/avatar.png" class="user">


		<h2>Check Availibility</h2>


		<form action="checkavailability" method="POST">
			<br>
			<br>
			<br>




			<p>Your Name</p>
			<input name="vipname" type="text" id="uname" required>
			<p>Your NIC Number</p>
			<input name="Nic" type="text" id="Nic" required> <input
				type="submit" value="Submit" id="button" class="button"><br>
			<br>




		</form>
	</div>


</body>
</html>