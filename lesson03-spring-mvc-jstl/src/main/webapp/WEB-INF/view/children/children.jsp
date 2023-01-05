<%@ include file="../../taglib/import.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CHILDREN</title>
</head>
<body>
<table>
    <thead>
    <td>ID</td>
    <td>NAME</td>
    <td>AGE</td>
    </thead>
    <c:forEach var="child" items="${children}">
        <tr>
            <td>${child.id}</td>
            <td>${child.fullName}</td>
            <td>${child.age}</td>
        </tr>
    </c:forEach>
</table>
<hr>
<div style="margin-top: 10px">
<a class="add-btn" href="${contextPath}/add-children-form"> + </a>
</div>
</body>
</html>
