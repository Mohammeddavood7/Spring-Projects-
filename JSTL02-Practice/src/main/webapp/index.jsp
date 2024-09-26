<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Libraries</title>
</head>
<body>

	<c:set var="num" value="${2}" />


	<%-- <c:choose>

		<c:when test="${num > 100}">
          ${num} is greather than 100
        </c:when>

		<c:when test="${num > 1000}">
          ${num} is greather than 100
        </c:when>

		<c:otherwise>
        ${num}
        </c:otherwise>
	</c:choose> --%>
	<%-- 
	<c:forTokens items="1,2,3,4" delims="," var="n1">
	<c:out value="${n1 }"></c:out>
	<c:set value=""></c:set>
	</c:forTokens> --%>
	<%-- 	
	<c:forEach begin="1" end="10" var="n" step="2">
	
	<c:out value="${n}"></c:out>
	</c:forEach>
	
	 --%>

	<%-- <c:url value="/index.jsp" var="myURL">
		<c:param name="trackingId" value="1234" />
		<c:param name="reportType" value="summary" />
		<c:param name="reportType" value="summary" />
		<c:param name="reportType" value="summary" />
		<c:param name="reportType" value="summary" />
	</c:url>
	<c:out value="${myURL}"></c:out>
 --%>


	<%--  <body>
      <c:redirect url = "output.jsp"/>
   </body>
 --%>

	<%-- fmt:formatNumber value="100" type="number"
	var="n"></fmt:formatNumber> <c:out value="${n*10 }"></c:out> --%>

  <fmt:bundle  basename="messages.properties">
  
  <fmt:message key="username"></fmt:message>
  </fmt:bundle>
  
  
</body>
</html>