<%@ page import="com.webproj.model.Employee"%>
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
	background-color: #e0f7fa;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
	width: 320px;
	text-align: center;
}

.container h1 {
	margin-bottom: 20px;
	color: #00796b;
}

label {
	display: block;
	text-align: left;
	margin-bottom: 10px;
	font-weight: bold;
	color: #00796b;
}

input[type=text], input[type=number] {
	width: calc(100% - 20px);
	padding: 10px;
	margin-bottom: 15px;
	border: 2px solid #00796b;
	border-radius: 3px;
	font-size: 15px;
	box-sizing: border-box;
}


}
</style>

<script type="text/javascript">
	function goToAllEmployeeList() {
		alert("going back please click ok")
		document.frm.action = "getAllEmployees";
		document.frm.submit();

	}
</script>
</head>
<body>
	<%
	Employee emp = (Employee) request.getAttribute("employee");
	%>
	<div class="container">
		<h1>Insert New Employee</h1>
		<springForm:form name="frm" action="updateEmployeePage" modelAttribute="employee">
			<springForm:label path="empId" >Employee Id:</springForm:label> 
			<springForm:input type="text" id="empId" path="empId" value="<%=emp.getEmpId()%>" readonly=""/> 
			<springForm:errors path="empId"/>
			
			<springForm:label path="empName">Employee Name:</springForm:label> 
			<springForm:input type="text" id="empName" path="empName"  placeholder="old = <%=emp.getEmpName()%>"/>
			<springForm:errors path="empName"/>
			 
			<springForm:label path="empAddress">Employee Address:</springForm:label> 
			<springForm:input type="text" id="empAddress" path="empAddress" placeholder="old = <%=emp.getEmpAddress()%>"/>
			<springForm:errors path="empAddress"/>
			
			<springForm:label path="empSalary">Employee Salary:</springForm:label> 
			<springForm:input type="text" id="empSalary" path="empSalary" placeholder="old = <%=emp.getEmpSalary()%>"/>
			<springForm:errors path="empSalary"/>
			
			<button class="btn btn-secondary" type="button" onclick="goToAllEmployeeList()">Back</button>
			<input  class="btn btn-primary" type="submit" value="Submit">
		</springForm:form>
	</div>
</body>
</html>
