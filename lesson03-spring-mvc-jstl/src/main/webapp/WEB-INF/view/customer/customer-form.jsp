<%--
  Created by IntelliJ IDEA.
  User: vietdev
  Date: 08/12/2022
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/customer-process" method="post">
    <div>
        <input type="text" name="fullName" placeholder="First Name">
    </div>
    <div>
        <input type="text" name="lastName" placeholder="Last name">
    </div>
    <div>
        <input type="number" name="age" placeholder="Age">
    </div>
    <div>
        <input type="submit" value="Submit" >
    </div>
</form>
</body>
</html>
