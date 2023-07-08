<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home Page 26.11</title>
	<style>
		.text-error {
			color: red;
		}
	</style>
</head>
<body>
	<h2>Welcome to Spring MVC - JSTL - 26.11</h2>
	
	<hr>
	
	<br>
	
	<a href="${pageContext.request.contextPath}/helloworld/showForm">Click to show HelloWorld form</a>
	<br><br>
	
	<a href="${pageContext.request.contextPath}/customer/showForm">Click to show Customer form</a>
	<br><br>
	
	<a href="${pageContext.request.contextPath}/student/showForm">Click to show Student form</a>
	<br><br>
	
	<hr>
	
	<h2 class='text-error'>ALL THE BEST</h2>
</body>
</html>