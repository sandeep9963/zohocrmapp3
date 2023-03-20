<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Bill</title>
</head>
<body>
   	<h2>Billing Successful</h2>
   	<table border=1>
   		<tr>
   			<td>FirstName</td>
   			<td>${billing.firstName }</td>
   		</tr>
   		<tr>
   			<td>LastName</td>
   			<td>${billing.lastName }</td>
   		</tr>
   		<tr>
   			<td>Email</td>
   			<td>${billing.email }</td>
   		</tr>
   		<tr>
   			<td>Mobile</td>
   			<td>${billing.mobile }</td>
   		</tr>
   		<tr>
   			<td>Product</td>
   			<td>${billing.product }</td>
   		</tr>
   		<tr>
   			<td>Amount</td>
   			<td>${billing.amount }</td>
   		</tr>
   	</table>
</body>
</html>