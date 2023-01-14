<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../taglib/import.jsp" %>
<html>
<head>
    <title>Customer Form</title>
</head>
<body>
<form:form modelAttribute="customer" action="${contextPath}/customer-process" method="post">
    <div>
        First Name: <form:input type="text" name="firstName" placeholder="First Name" path="firstName"/>
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
        <input type="submit" value="Submit">
    </div>
</form:form>
</body>
</html>
