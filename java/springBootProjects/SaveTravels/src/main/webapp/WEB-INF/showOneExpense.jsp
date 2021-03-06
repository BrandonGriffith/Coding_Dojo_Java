<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<title>Expense Details</title>
</head>
<body>
	<a href="/">Go Back</a>
    <h1>Expense Details: </h1>
    <h3>Expense Name:  ${expense.name}</h3>
    <h3>Expense Vendor:  ${expense.vendor}</h3>
    <h3>Expense Amount:  ${expense.amount}</h3>
    <h3>Expense Description:  ${expense.description}</h3>
</body>
</html>