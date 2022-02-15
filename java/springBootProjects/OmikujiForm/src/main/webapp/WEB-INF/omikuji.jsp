<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<title>Omikuji</title>
</head>
<body>
    <div class="container text-center omikuji">
    <h1>Here's Your Omikuji</h1>
    <p class="main-text">In <%= session.getAttribute("num_input")  %> years you will live in
        <%= session.getAttribute("city")  %> with <%= session.getAttribute("name")  %> 
        as your roommate. You will <%= session.getAttribute("activity") %> for a living.
        The next time you see a <%= session.getAttribute("animal")  %>, you will 
        have good luck. Also, <%= session.getAttribute("nice")  %>.
    </p>
    </div>
    <div class="text-center">
        <a href="/">Go Back</a>
    </div>
</body>
</html>
