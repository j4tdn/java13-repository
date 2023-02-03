<%@include file="../taglib/import.jsp" %>
<html>
<body>
<h2>Welcome you to homepage!</h2>
<hr>
<h2>User: <security:authentication property="principal.username"></security:authentication></h2>
<h2>Role(s): <security:authentication property="principal.authorities"></security:authentication></h2>
<hr>
<security:authorize access="hasRole('MANAGER')">
    <div><a href="${contextPath}/managers/">
        Go to managers page
    </a></div>
</security:authorize>
<security:authorize access="hasRole('ADMIN')">
    <div><a href="${contextPath}/admin/">
        Go to admin page
    </a></div>
</security:authorize>
<hr>
<form:form action="${contextPath}/logout" method="POST">
    <input value="Logout" type="submit">
</form:form>
</body>
</html>
