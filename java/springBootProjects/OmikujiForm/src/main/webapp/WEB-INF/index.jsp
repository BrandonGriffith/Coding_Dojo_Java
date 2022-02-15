<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
<title>Omikuji Form</title>
</head>
<body>
	<div class="container omikuji-form">
        <h1>Omikuji Form</h1>
        <form action="/omikuji_info" method="post">
            <div class="form-group">
                <label for="">Pick any number:</label>
                <input type="number" name="num_input" id="" class="form-control" style = "width: 10%;">
            </div>
            <div class="form-group">
                <label for="">Enter name of city:</label>
                <input type="text" name="city" id="" class="form-control" style = "width: 300px;">
            </div>
            <div class="form-group">
                <label for="">Enter anyone's name:</label>
                <input type="text" name="name" id="" class="form-control" style = "width: 300px;">
            </div>
            <div class="form-group">
                <label for="">Enter something you would like to do:</label>
                <input type="text" name="activity" id="" class="form-control" style = "width: 300px;">
            </div>
            <div class="form-group">
                <label for="">Enter any animal:</label>
                <input type="text" name="animal" id="" class="form-control" style = "width: 300px;">
            </div>
            <div class="form-group">
                <label for="">Say something nice:</label>
                <textarea name="nice" id="" cols="30" rows="10" class="form-control" style = "width: 55%;"></textarea>
            </div>
            <input type="submit" value="Submit" class="btn btn-info">
        </form>
    </div>
</body>
</html>