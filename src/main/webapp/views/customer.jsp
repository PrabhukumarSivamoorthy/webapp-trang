<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Info</title>
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
	
	<table>
		<thead>
			<tr>
				<th>Customer Details</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Customer Id</td>
				<td>${customer.cid}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${customer.firstName}</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${customer.lastName}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${customer.age}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>