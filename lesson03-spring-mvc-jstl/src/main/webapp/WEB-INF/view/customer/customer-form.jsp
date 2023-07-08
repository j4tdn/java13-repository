<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form action="${pageContext.request.contextPath}/customer/processForm" method="post" class="cm-1">
		<div>
			<label>First name: </label>
			<input type="text" name="firstName" placeholder="What's your first name?" />
		</div>
		
		<div>
			<label>Last name: </label>
			<input type="text" name="lastName" placeholder="What's your last name?" />
		</div>
		
		<div>
			<label>Age: </label>
			<input type="number" name="age" placeholder="What's your age?" />
		</div>
		
		<input type="submit" value="Submit query">
	</form>
</body>
</html>