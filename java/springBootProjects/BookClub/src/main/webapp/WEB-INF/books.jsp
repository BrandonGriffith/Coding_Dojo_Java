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
<title>Welcome</title>
</head>
<body>
	<div class="container col-8">
	<h1 class="text-primary">Welcome, ${loggedInUser.userName}!</h1>
	<h3>Everyone's thoughts on books.</h3>
    <a href="/logout">Logout</a>
    <p></p>
	<a href="/books/new">Add a New Book</a>
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">#ID</th>
				<th scope="col">Title:</th>
				<th scope="col">Author Name:</th>
				<th scope="col">Posted By:</th>
				<th>Actions: </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items='${ allBooks }' var='bookObj'>
				<tr>
					<th scope="row">${bookObj.id}</th>
					<td><a href="/books/${bookObj.id}">${bookObj.title}</a></td>
					<td>${bookObj.author}</td>
					<td>${bookObj.user.userName}</td>
					<td>
						<c:if test="${loggedInUser.id == bookObj.user.id}">
						<a href="/books/edit/${bookObj.id}">Edit</a> ||
						<a href="/books/delete/${bookObj.id}" class="btn btn-danger">Delete</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>