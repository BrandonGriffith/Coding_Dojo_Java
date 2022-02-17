<!-- c:out ; c:forEach ; c:if -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- form:form -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
                    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                    crossorigin="anonymous">
                <link rel="stylesheet" href="/css/style.css">
                <title>Save Travels</title>
            </head>

            <body>
                <div class="container col-5">

                    <h1>Save Travels</h1>

                    <table class="table table-dark">
                        <thead>
                            <tr>
                                <th scope="col">#ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Vendor</th>
                                <th scope="col">Amount</th>
                                <th>Actions: </th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items='${ allExpenses }' var='expenseObj'>
                                <tr>
                                    <th scope="row">${expenseObj.id}</th>
                                    <td><a href="/expense/${expenseObj.id}">${expenseObj.name}</a></td>
                                    <td>${expenseObj.vendor}</td>
                                    <td>$${expenseObj.amount}</td>
                                    <td>
                                        <a href="/expense/edit/${expenseObj.id}">Edit</a> ||
                                        <a href="/expense/delete/${expenseObj.id}" class="btn btn-danger">Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <hr>
                    <h1>Add an expense:</h1>
                    <form:form action="/expense/create" method="post" modelAttribute="expense">
                        <p>
                            <form:label path="name">Name: </form:label>
                            <form:errors path="name" class="text-danger" />
                            <form:input type="text" path="name" class="form-control" />
                        </p>
                        <p>
                            <form:label path="vendor">Vendor:</form:label>
                            <form:errors path="vendor" class="text-danger" />
                            <form:input type="text" path="vendor" class="form-control" />
                        </p>
                        <p>
                            <form:label path="amount">Amount: </form:label>
                            <form:errors path="amount" class="text-danger" />
                            <form:input type="number" path="amount" step="0.01" class="form-control" />
                        </p>
                        <p>
                            <form:label path="description">Description: </form:label>
                            <form:errors path="description" class="text-danger" />
                            <form:textarea path="description" class="form-control" />
                        </p>
                        <input type="submit" value="Submit" />
                    </form:form>
                </div>
            </body>

            </html>