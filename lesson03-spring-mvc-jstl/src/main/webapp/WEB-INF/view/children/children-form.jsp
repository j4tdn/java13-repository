<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../taglib/import.jsp"%>
<html>
<head>
    <title>CHILDREN FORM</title>
</head>
<body>
<form:form modelAttribute="children" method="post" action="${contextPath}/add-children">
  <form:input path="id" placeholder="id" type="text"></form:input>
  <form:input path="fullName" placeholder="fullName" type="text"></form:input>
  <form:input path="yearOfBirth" placeholder="yearOfBirth" type="text"></form:input>
  <input type="submit" value="submit">
</form:form>
</body>
</html>
