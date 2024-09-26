<%@ page import="com.webproj.model.Employee,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Employee List</h2>
    <table>
        <thead>
            <tr>
                <th>Employee ID</th>
                <th>Employee Name</th>
                <th>Employee Address</th>
                <th>Employee Salary</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<Employee> empList = (List<Employee>) request.getAttribute("emp");

            if (empList != null) {
                for (Employee emp : empList) {
            %>
            <tr>
                <td><%= emp.getEmpId() %></td>
                <td><%= emp.getEmpName() %></td>
                <td><%= emp.getEmpAddress() %></td>
                <td><%= emp.getEmpSal() %></td>
            </tr>
            <% 
                }
            } else {
            %>
            <tr>
                <td colspan="4">No employees found</td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
