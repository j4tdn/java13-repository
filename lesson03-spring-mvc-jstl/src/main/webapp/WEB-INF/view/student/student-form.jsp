<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../taglib/import.jsp" %>

<html>
<head>
    <title>Student Form</title>
    <link rel="stylesheet" href="<c:url value="/static/css/style.css"/>">
</head>
<body>
<form:form modelAttribute="student" action="${contextPath}/student-process" method="post">
    <div>
        <form:input type="number" path="id" placeholder="ID"/>
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
        <c:forEach var="language" items="${favoriteLanguages}">
            <form:radiobutton path="favoriteLanguage" value="${language}" label="${language}"></form:radiobutton>
        </c:forEach>
    </div>
    <div>
        Operating Systems:
        <c:forEach var="os" items="${operatingSystems}">
            <form:checkbox path="operatingSystems" value="${os}" label="${os}"></form:checkbox>
        </c:forEach>
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form:form>
</body>
</html>
