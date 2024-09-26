<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="springForm"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="springF" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<h1>Student Details</h1>
	<springForm:form action="viewStudentDetails" modelAttribute="student"
		method="post">
		<span>First Name:</span>
		<springForm:input type="text" path="firstName" />
		<springForm:errors path="firstName" style='color:red' />
		<br>
		<span>Last Name:</span>
		<springForm:input type="text" path="lastName" />
		<springForm:errors path="lastName" style='color:red' />
		<br>
		<span>Address:</span>
		<springForm:input type="text" path="address" />
		<springForm:errors path="address" style='color:red' />
		<br>
		<input type="submit" />
	</springForm:form>
</body>
</html>
