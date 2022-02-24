<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<title>${book.title}</title>
</head>
<body>
	<div class="container col-4">
	<h1>Hello ${loggedInUser.userName}</h1>
	<a href="/books">Go Back</a>
    <h1>${book.title}</h1>
    <h2>
        <span style="color:red;">${book.user.userName}</span> 
        read 
        <span style="color:purple;">${book.title}</span> 
        by <span style="color:green;">${book.author}</span>
    </h2>
    <p></p>
    <h3>Here are ${book.user.userName} thoughts:</h3>
    <hr>
    <h3>${book.thought}</h3>
    <hr>
    <c:if test="${loggedInUser.id == book.user.id}">
		<a href="/books/edit/${book.id}" class="btn btn-danger">Edit</a> || 
		<a href="/books/delete/${book.id}" class="btn btn-danger">Delete</a>
	</c:if>
    </div>
</body>
</html>