<%@ page import="servlet.entity.CustomerEntity" %><%--
  Created by IntelliJ IDEA.
  User: CODE.ID
  Date: 02/04/2019
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
    <h1>
        Hello
        <%
            CustomerEntity customer = (CustomerEntity) request.getAttribute("customer");
            out.print(customer.getNama());
        %>
    </h1>
</body>
</html>
