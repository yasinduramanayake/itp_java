
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M & M Creations</title>
<link href="style.css" rel="stylesheet">
<style>
body{
	background-image:url("images/sofa2.jpg");
}
#two{
	font-size:25px;
	background-color: #DDA0DD;
	box-shadow: 0 5px #666;
	font-family: cursive;
}
#f{
	font-family: cursive;
	color:#000000;
	font-size: 30px;
}

</style>
</head>
<body>

<div class="header">

	<form action="viewI" method="post">
	<h1>Previous Item Adds</h1>

	<div class="form-box">
	
	<input type="text" name="itemcode" class="search-field business" placeholder="Search Item Code here">
	<input class="search-btn" type="submit" name="submit" value="Search">
	
	</div><br>
		
	</form>

<center>
	<form action = "insertI" method="post">
	
	<h1>New Item</h1>
	<table>
	<tr>
		<td><d id="f">  Price </d></td>
		<td><input type="text" name="price" id="price" placeholder="Price" required style="height:30px; width:150px;"></td>
	</tr>
	<tr>
		<td><d id="f">  Discount </d></td>
		<td><input type="text" name="discount" id="discount" placeholder="Discount" required style="height:30px; width:150px;"></td>
	</tr>
	<tr>
		<td><d id="f">  Category </d></td>
		<td><select name="category" id="category" required style="height:37px; width:156px;">
                <option>Hotel</option>
                <option>Office</option>
                <option>Pantey&Kitchen</option>
                <option>Sofa</option>
                <option>Wooden&Decking</option>
                <option>HouseHold</option>
                </select ></td>
	</tr>
	<tr>	
		<td><d id="f">  Item Code </d></td>
		<td><input type="text" name="itemcode" id="itemcode" placeholder="Item Code" required style="height:30px; width:150px;"></td>
	</tr>
	</table><br>
		
		<input type="button" id="demo3" value="DEMO 3" onClick="demo()">
		<input type="submit" name="submit" value="Submit" id="two">
	
	</form><br>
	
	<form action="itemPdf" method="post" >
      <button type ="submit" id="two">Get Item History Pdf</button>
    </form><br>
    
    <a href="AdminDashboard.jsp" id="two">Back To Dashboard</a>
    
</center>
</div>	
</body>

<script type="text/javascript">
	function demo(){
		document.getElementById("price").value = "Rs.45000";
		document.getElementById("discount").value = "12%";
		document.getElementById("category").value = "Pantey&Kitchen";
		document.getElementById("itemcode").value = "IC020";
	}
</script>
</html>