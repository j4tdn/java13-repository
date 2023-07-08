<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World Form</title>
<style>
	.cm-1>* {
		margin-top: 1rem;
		margin-bottom: 1rem;
	}
</style>
</head>
<body>

	<form:form modelAttribute="student" action="${pageContext.request.contextPath}/student/processForm" method="post" class="cm-1">
		<div>
			<label>Id: </label>
			<form:input type="text" path="id" placeholder="What's your id?" />
		</div>
		
		<div>
			<label>Full name: </label>
			<form:input type="text" path="fullName" placeholder="What's your name?" />
		</div>
		
		<div>
			<label>Age: </label>
			<form:input type="number" path="age" placeholder="What's your age?" />
		</div>
		
		<input type="submit" value="Submit query">
	</form:form>
</body>
</html>