<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<title>New Book</title>
</head>
<body>
    <div class="container col-4">
    <h1>Add a new book:</h1>
    <a href="/books">Go Back</a>
        <form:form action="/books/create" method="post" modelAttribute="book">
                        <p>
                            <form:label path="title">Title: </form:label>
                            <form:errors path="title" class="text-danger" />
                            <form:input type="text" path="title" class="form-control" />
                        </p>
                        <p>
                            <form:label path="author">Author:</form:label>
                            <form:errors path="author" class="text-danger" />
                            <form:input type="text" path="author" class="form-control" />
                        </p>
                        <p>
                            <form:label path="thought">Thoughts: </form:label>
                            <form:errors path="thought" class="text-danger" />
                            <form:textarea type="number" path="thought" class="form-control" />
                        </p>
                        <p>
                            <form:input type="hidden" path="user" value="${loggedInUser.id}"/>
                        </p>
                        <input type="submit" value="Submit" />
        </form:form>
    </div>
</body>
</html>