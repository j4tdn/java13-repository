<%--
  Created by IntelliJ IDEA.
  User: vietdev
  Date: 08/12/2022
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Form</title>
    <link rel="stylesheet" href="<c:url value="/static/css/style.css"/>">
</head>
<body>
<form:form modelAttribute="customer" action="${pageContext.request.contextPath}/customer-process" method="post" >
    <div>
        First Name: <form:input type="text" name="fullName" placeholder="First Name" path="firstName"/>
        <form:errors path="firstName" cssClass="error"/>

    </div>
    <div>
        Last Name (*): <form:input type="text" name="lastName" placeholder="Last name" path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
    </div>
    <div>
        Free Passes (*): <form:input type="text" name="freePasses" placeholder="Free Passes" path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
    </div>
    <div>
        Postal Code (*): <form:input type="text" name="postalCode" placeholder="Postal Code" path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
    </div>
    <div>
        <input type="submit" value="Submit" >
    </div>
</form:form>
</body>
</html>
