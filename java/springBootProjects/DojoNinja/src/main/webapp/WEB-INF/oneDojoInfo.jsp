<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Dojo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container col-5">
        <h1>Info about Dojo: ${dojoToshow.name} </h1>
        <table class="table table-dark">
            <thead>
            <tr>
                <th scope="col">Ninja ID</th>
                <th scope="col">First</th>
                <th scope="col">Last</th>
                <th scope="col">Age</th>
                <th scope="col">Current Dojo</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach items='${ dojoToshow.dojos }' var='ninjaObj'>
                    <tr>
                        <th scope="row">${ninjaObj.id}</th>
                        <td>${ninjaObj.firstName}</td>
                        <td>${ninjaObj.lastName}</td>
                        <td>${ninjaObj.age}</td>
                        <td>${ninjaObj.dojo.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>