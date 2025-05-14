<%--
  Created by IntelliJ IDEA.
  User: eganp
  Date: 5/13/2025
  Time: 1:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Home Page</h1>
    <c:forEach items="${allProduction}" var="production">
        <a href="/production/${production.id}">
            <h1>${production.title}</h1>
        </a>
    </c:forEach>
</body>
</html>
