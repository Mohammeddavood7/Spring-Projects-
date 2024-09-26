
<%@ page import="com.webproj.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	Employee emp = (Employee) request.getAttribute("emp");
	%>
	<div class="container">
		<h1>Insert New Employee</h1>
		<form name="frm" action="updateEmployeePage">
			<label for="empId">Employee Id:</label> <input type="text" id="empId"
				name="empId" value="<%=emp.getEmpId()%>" readonly> <label
				for="empName">Employee Name:</label> <input type="text" id="empName"
				name="empName" placeholder="old = <%=emp.getEmpName()%>"> <label
				for="empAddress">Employee Address:</label> <input type="text"
				id="empAddress" name="empAddress"
				placeholder="old = <%=emp.getEmpAddress()%>"> <label
				for="empSalary">Employee Salary:</label> <input type="text"
				id="empSalary" name="empSalary"
				placeholder="old = <%=emp.getEmpSal()%>">
			<button class="btn btn-secondary" type="button" onclick="goToAllEmployeeList()">Back</button>
			<input  class="btn btn-primary" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>
