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
		<form name="frm" action=insertEmployeePage method="post">
			<label for="empName">Employee Name:</label> <input type="text"
				id="empName" name="empName"> <label for="empAddress">Employee
				Address:</label> <input type="text" id="empAddress" name="empAddress">

			<label for="empSalary">Employee Salary:</label> <input type="number"
				id="empSalary" name="empSalary">
			<button class="btn btn-secondary" type="button"
				onclick="goToAllEmployeeList()">Back</button>

			<input class="btn btn-success" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>
