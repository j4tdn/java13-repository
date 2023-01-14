<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../taglib/import.jsp" %>
<html>
<head>
    <title>Child Form</title>
</head>
<body>
<form:form modelAttribute="child" action="${contextPath}/add-child" method="post" >
    ID: <form:input type="number" path="id" placeholder="id" ></form:input>
    <form:errors path="id" cssClass="error"/>
    <br><br>
    FullName: <form:input type="text" path="fullName" placeholder="fullName" ></form:input>
    <form:errors path="fullName" cssClass="error"/>
    <br><br>
    Year of Birth: <form:input type="number" path="yearOfBirth" placeholder="yearOfBirth" ></form:input>
    <form:errors path="yearOfBirth" cssClass="error"/>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
