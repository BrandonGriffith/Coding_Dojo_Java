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
<title>Book Club</title>
</head>
<body>
    <div class="container">
        <h1 class="text-primary">Book Club!</h1>
        <h3>Join our growing community and share your thoughts on books.</h3>
        <div class="row justify-content-between">
            <div class="col-5">
                <h1>Register</h1>
                <form:form action="/register" method="post" modelAttribute="newUser">
                    <div>
                        <form:label path="userName">User Name</form:label>
                        <form:errors path="userName"/>
                        <form:input path="userName" type="text" class= "form-control"/>
                    </div>
                    <div>
                        <form:label path="email">Email</form:label>
                        <form:errors path="email"/>
                        <form:input path="email" type="email" class= "form-control"/>
                    </div>
                    <div>
                        <form:label path="password">Password</form:label>
                        <form:errors path="password"/>
                        <form:input path="password" type="password" class= "form-control"/>
                    </div>
                    <div>
                        <form:label path="confirm">Confirm Password</form:label>
                        <form:errors path="confirm"/>
                        <form:input path="confirm" type="password" class= "form-control"/>
                    </div>
                    
                    <input type="submit" value="Submit" class= "btn btn-success mt-3"/>
                </form:form>   
            </div>
            <div class="col-5">
                <h1>Login:</h1>
                <form:form action="/login" method="post" modelAttribute="newLogin">

                    <div>
                        <form:label path="email">Email</form:label>
                        <form:errors path="email"/>
                        <form:input path="email" type="email" class= "form-control"/>
                    </div>
                    <div>
                        <form:label path="password">Password</form:label>
                        <form:errors path="password"/>
                        <form:input path="password" type="password" class= "form-control"/>
                    </div>
                    
                    <input type="submit" value="Login" class= "btn btn-success mt-3"/>
                </form:form>   
            </div>
        </div>
    </div>
</body>
</html>