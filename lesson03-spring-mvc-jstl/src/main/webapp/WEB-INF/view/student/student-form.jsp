<%--
  Created by IntelliJ IDEA.
  User: vietdev
  Date: 08/12/2022
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Student Form</title>
    <link rel="stylesheet" href="<c:url value="/static/css/style.css"/>">
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
        <form:select path="country">
            <c:forEach var="ctitem" items="${countries}">
                <form:option value="${ctitem}" label="${ctitem}"></form:option>
            </c:forEach>
        </form:select>
    </div>
    <div>
        Favorite Language:
        <form:radiobutton path="favoriteLanguage" value="JAVA" label="JAVA"></form:radiobutton>
        <form:radiobutton path="favoriteLanguage" value="PYTHON" label="PYTHON"></form:radiobutton>
        <form:radiobutton path="favoriteLanguage" value=".NET" label=".NET"></form:radiobutton>
    </div>
    <div>
        Operating Systems:
        <form:checkbox path="operatingSystems" value="MACOS" label="MACOS"></form:checkbox>
        <form:checkbox path="operatingSystems" value="LINUX" label="LINUX"></form:checkbox>
        <form:checkbox path="operatingSystems" value="WINDOWS" label="WINDOWS"></form:checkbox>
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form:form>
</body>
</html>
