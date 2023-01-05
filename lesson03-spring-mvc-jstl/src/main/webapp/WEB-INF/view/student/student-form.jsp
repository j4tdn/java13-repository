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
