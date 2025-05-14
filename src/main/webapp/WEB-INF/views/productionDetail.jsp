<%--
  Created by IntelliJ IDEA.
  User: eganp
  Date: 5/14/2025
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${error}</p>

    <h1>${production.title}</h1>
    <p>${production.description}</p>
    <p>${production.author}</p>
    <p>${production.price}</p>
</body>
</html>
