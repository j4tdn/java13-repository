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
    <title>Student Form</title>
</head>
<body>
<form:form modelAttribute="student" action="${pageContext.request.contextPath}/student-process" method="post">
    <div>
        <form:input type="number" path="id" placeholder="ID" />
    </div>
    <div>
        <form:input type="text" path="fullName" placeholder="Full name"/>
    </div>
    <div>
        <form:input type="number" path="age" placeholder="Age"/>
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form:form>
</body>
</html>
