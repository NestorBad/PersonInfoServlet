<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: honey
  Date: 17.05.18
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Persons</title>
</head>
<body>
<h1 align="center">Person List</h1>
<table align="center" border="2">
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Отчество</th>
        <th>Телефон</th>
        <th>email</th>
    </tr>
    <c:forEach var="person" items="${persons}">
        <tr>
            <td>${person.id}</td>
            <td>${person.first}</td>
            <td>${person.second}</td>
            <td>${person.third}</td>
            <td>${person.phone}</td>
            <td>${person.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
