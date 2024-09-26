<%@ page import="com.webproj.model.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
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
}

.container {
	max-width: 960px;
	margin: 20px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
}

button {
	background-color: #4CAF50;
	color: white;
	border: none;
	padding: 8px 12px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 14px;
	cursor: pointer;
	border-radius: 3px;
}

button:hover {
	background-color: #45a049;
}

button.edit {
	background-color: #2196F3;
}

button.edit:hover {
	background-color: #1e88e5;
}

button.delete {
	background-color: #f44336;
}

button.delete:hover {
	background-color: #e53935;
}
</style>
<script>

    function addEmployee()
    {
        document.frm.action = "insertEmployee";
        document.frm.submit();
    }
    
    function deleteEmployee(id)
    {
            document.frm.empId.value = id;    
            document.frm.action = "deleteEmployee";
            document.frm.submit();
    }
    
    function editEmployee(id) 
    {
    
        document.frm.empId.value = id;
        document.frm.action = "getEmployee";
        document.frm.submit();
        document.getElementById("editMessage").innerText = 'Update successfully';
    }
    
    function searchEmployees()
    {
    	document.frm.action = "searchEmployees";
    	document.frm.submit();
    	
    }
    
</script>
</head>
<body>
	<div class="container">
		<h1 align="center">Employee List</h1>

		<form name="frm">
			<button type="button" onclick="addEmployee()">Add Employee</button>
			<div class="m-1">
				<select class="form-select" aria-label="Default select example"
					name="search_type">
					<option value="NAME">Name</option>
					<option value="ADDRESS">Address</option>
					<option value="SALARY">Salary</option>
				</select> 
				<input class="w-100 form-control" name="search_value" id="search_value" >
				<button class="w-100 border border-white " type="button"
					onclick="searchEmployees()">Search</button>
			</div>
			<input type="hidden" name="empId"> <input type="hidden"
				name="empObject">
			<table>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Address</th>
					<th>Employee Salary</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:if test="${fn:length(emp) == 0}">
					<td colspan="6" style="text-align: center"><c:out
							value="No Employee Record Available" /></td>
				</c:if>
				<c:if test="${fn:length(emp) > 0}">
					<c:forEach items="${emp}" var="emp">
						<tr>
							<td><c:out value="${emp.empId}" /></td>
							<td><c:out value="${emp.empName}" /></td>
							<td><c:out value="${emp.empAddress}" /></td>
							<td><c:out value="${emp.empSalary}" /></td>
							<td><button type="button" class="edit"
									onclick="editEmployee(${emp.empId})">Edit</button></td>
							<td><span id="editMessage"></span>
								<button type="button" class="delete"
									onclick="deleteEmployee(${emp.empId})">Delete</button></td>
						</tr>
					</c:forEach>
				</c:if>
			</table>
		</form>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
