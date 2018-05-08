<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<style type="text/css">
body {
	background: #E9EBEE;
}
.bgc{
background-color: #563D7C;
}
</style>

</head>
<body>
	<nav class="navbar  navbar-dark bgc">
	<span class="navbar-brand mb-0 h1">IMCS groupInc</span> <a
		class="btn btn-outline-success my-2 my-sm-0"
		href="/customerwebapp/index.jsp">Home</a> </nav>
	<br>

	<div class="container">
		<div style="width:800px; margin:0 auto;">
			<div class="alert alert-danger" 
				style="max-width: 650px;">Invalid Credentials</div>
			<form action="/customerwebapp/login" method="post" style="max-width: 650px;">
				<h2 align="center">Login into your Account</h2>
				<label for="inputEmail">Email address</label> <input type="text"
					name="inputEmail" class="form-control"> <label
					for="inputPassword">Password</label> <input type="password"
					name="inputPassword" class="form-control"> <br>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
					in</button>
			</form>
		</div>
	</div>
</body>
</html>