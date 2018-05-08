<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee DashBoard</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<style><%@include file = "../views/css/home.css"%></style>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript">

function home() {
	document.getElementById("p1").innerHtml= 'Employee Details (You)';
    document.getElementById("Home").style.display= "block";
    document.getElementById("PlaceOrder").style.display= "none";
    document.getElementById("ShowCustomer").style.display= "none";
    document.getElementById("SaveCustomer").style.display= "none";
}
function showCustomer() {
		document.getElementById("p1").innerHtml= 'CustomerDetails';
	    document.getElementById("Home").style.display= "none";
	    document.getElementById("PlaceOrder").style.display= "none";
	    document.getElementById("ShowCustomer").style.display= "block";
	    document.getElementById("SaveCustomer").style.display= "none";
}
function placeOrder() {
	    document.getElementById("p1").innerHtml= "PlaceOrder";
	 	document.getElementById("Home").style.display= "none";
	    document.getElementById("PlaceOrder").style.display= "block";
	    document.getElementById("ShowCustomer").style.display= "none";
	    document.getElementById("SaveCustomer").style.display= "none";
}
function saveCustomer() {
		document.getElementById("p1").innerHtml= "Enter CustomerDetails";
	    document.getElementById("Home").style.display= "none";
	    document.getElementById("PlaceOrder").style.display= "none";
	    document.getElementById("ShowCustomer").style.display= "none";
	    document.getElementById("SaveCustomer").style.display= "block";
}
</script>
</head>
<body>
	<nav class="navbar  navbar-dark" style="background-color: #563D7C">
	<span class="navbar-brand mb-0 h1">IMCS groupInc</span> 
	<a class="btn btn-outline-success my-2 my-sm-0" href="/customerwebapp/views/login.jsp">SignOut</a> 
	</nav>
	<div class="sidenav">

		<a href="#" onclick="home()" class="w3-bar-item w3-button">Home</a>
		<a href="#" onclick="showCustomer()" class="w3-bar-item w3-button">Show Customer</a>
		<a href="#" onclick="placeOrder()" class="w3-bar-item w3-button">Place Order</a>
		 <a href="#" onclick="saveCustomer()" class="w3-bar-item w3-button">Save Customer</a>
	</div>

	<!-- Page content -->
	<div class="main">
		<div id="titleDiv" style="font-size: 25px;"><p id="p1">Your Details</p></div>
		<div class="Container" id="SaveCustomer" style="width: 800px; margin: 0 auto; padding-top:2px; background: #F9F9F9; display: none;">
			<br>
			<form action="/customerwebapp/SaveCustomer" method="post">
			<div class="form-row">
					<div class="form-group col-md-6">
						<label for="fname">FirstName</label> <input type="text"
							class="form-control" name="fname" placeholder="FirstName">
					</div>
					<div class="form-group col-md-6">
						<label for="Lastname">LastName</label> <input
							type="text" class="form-control" name="LastName"
							placeholder="LastName">
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="creditlimit">CreditLimit</label> <input type="text"
							class="form-control" name="creditlimit" placeholder="670">
					</div>
					<div class="form-group col-md-4">
						<label for="inputState">Sales Representative Number</label> <select id="inputState"
							class="form-control">
							<option selected></option>
							<option>...</option>
						</select>
					</div>
				</div>	
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="emailenterd">Email</label> <input type="email"
							class="form-control" name="emailenterd" placeholder="Email">
					</div>
					<div class="form-group col-md-6">
						<label for="phoneNumber">PhoneNumber</label> <input
							type="text" class="form-control" name="phoneNumber"
							placeholder="numbers only Eg:12213123">
					</div>
				</div>
				
				<div class="form-group">
					<label for="inputAddress">Address</label> <input type="text"
						class="form-control" name="inputAddress" placeholder="1234 Main St">
				</div>
				<div class="form-group">
					<label for="inputAddress2">Address 2</label> <input type="text"
						class="form-control" name="inputAddress2"
						placeholder="Apartment, studio, or floor">
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputCity">City</label> <input type="text"
							class="form-control" name="inputCity">
					</div>
					<div class="form-group col-md-4">
						<label for="inputState">State</label> <select id="inputState"
							class="form-control">
							<option selected>Choose...</option>
							<option>...</option>
						</select>
					</div>
					<div class="form-group col-md-2">
						<label for="inputZip">Zip</label> <input type="text"
							class="form-control" name="inputZip">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Save</button>
			</form>
		</div>
		<div id = "Home" class="Container" style="width: 800px;  margin: 0 auto; background: #F9F9F9;">
		<br>
			<div class="form-row">
					<div class="form-group col-md-6">
						<label >FirstName   :-  </label>
						<label >FirstName</label>  
					</div>
					<div class="form-group col-md-6">
							<label >Emp ID   :-  </label>
						<label >I121</label> 
					</div>
				</div>
		</div>
		<div id = "ShowCustomer" class="Container" style="width: 800px; padding-top:2px; margin: 0 auto; background: #F9F9F9; display: none;">
		<br>
		<form action ="/customerwebapp/CustomerSearch" method="post">
		<div class="form-row">
					<div class="form-group col-md-6">
						<label for="showfName">FirstName</label> <input type="text"
							class="form-control" id="showfName" placeholder="FirstName">
					</div>
					<div class="form-group col-md-6">
						<label for="cid">Customer Number</label> <input
							type="text" class="form-control" name="cid"
							placeholder="12">
					</div>
					<button type="submit" class="btn btn-primary">Search</button>
				</div>
		</form>
		</div>
		<div id = "PlaceOrder" class="Container" style="width: 800px;  padding-top:2px;  margin: 0 auto; background: #F9F9F9; display: none;">
		<br>
		<form>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="customerID">Customer Number</label> <select id="inputState"
							class="form-control">
							<option selected>1</option>
							<option>...</option>
						</select>
					</div>
					<div class="form-group col-md-4">
						<label for="empID">Sales Representative Number</label> <select id="inputState"
							class="form-control">
							<option selected></option>
							<option>...</option>
						</select>
					</div>
				</div>	
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="productID">ProductID</label> <select id="inputState"
							class="form-control">
							<option selected>1</option>
							<option>...</option>
						</select>
					</div>
					<div class="form-group col-md-6">
						<label for="Date">Required Dater</label> <input
							type="text" class="form-control" id="phoneNumber"
							placeholder="yyyy-MM-dd">
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Save</button>
		</form>
		</div>
		
	</div>
</body>
</html>