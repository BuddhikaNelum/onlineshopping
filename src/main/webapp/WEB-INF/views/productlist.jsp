<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: buddhika
  Date: 7/29/18
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Category</th>
        <th>Price</th>
        <th>Description</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${products}" var="product">
    <tr>
        <td>${product.productName}</td>
        <td>${product.productCategory}</td>
        <td>${product.productPrice}</td>
        <td>${product.productDescription}</td>
        <td>${product.productStatus}</td>
    </tr>
</c:forEach>
    </tbody>
</table>

</body>
</html>
