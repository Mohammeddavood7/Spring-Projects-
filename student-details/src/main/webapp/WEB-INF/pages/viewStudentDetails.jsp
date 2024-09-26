<%@page import="org.springframework.web.bind.annotation.RequestAttribute"%>
<%@page import="com.webproj.model.Student,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
      <%Student s = (Student) request.getAttribute("student"); %>
       First Name :<%=s.getFirstName() %> <br>
       Last Name : <%=s.getLastName() %> <br>
       Address : <%=s.getAddress() %> <br>
</body>
</html>