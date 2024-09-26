<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert New Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

.container h1 {
	margin-bottom: 20px;
	color: #333;
}

label {
	display: block;
	text-align: left;
	margin-bottom: 10px;
	font-weight: bold;
}

input[type=text], input[type=number] {
	width: calc(100% - 20px);
	padding: 8px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 3px;
	font-size: 14px;
	
}

.error{
   color:red;
   font-style : "italic";
}

</style>
</head>
<script type="text/javascript">
	function goToAllEmployeeList() {
		alert("going back please click ok")
		document.frm.action = "getAllEmployees";
		document.frm.submit();

	}
</script>
<body>
	<div class="container">
		<h1>Insert New Employee</h1>
		<springForm:form name="frm" action="insertEmployeePage" modelAttribute="employee" method="post">
			<springForm:label path="empName">Employee Name:</springForm:label> 
			<springForm:input type="text" id="empName" path="empName"/> 
			<springForm:errors path="empName" cssClass="error"/>
			
			<springForm:label path="empAddress">Employee Address:</springForm:label> 
			<springForm:input type="text" id="empAddress" path="empAddress"/>
			<springForm:errors path="empName" cssClass="error"/>

			<springForm:label path="empSalary">Employee Salary:</springForm:label> 
			<springForm:input type="number" id="empSalary" path="empSalary"/>
			<springForm:errors path="empSalary" cssClass="error"/>
			
			<button class="btn btn-secondary" type="button" onclick="goToAllEmployeeList()">Back</button>
			<input class="btn btn-success" type="submit" value="Submit">
		</springForm:form>
	</div>
</body>
</html>
