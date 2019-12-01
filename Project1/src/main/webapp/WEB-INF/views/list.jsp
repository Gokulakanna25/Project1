<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Mobile num</td>
<td>fname</td>
<td>Lname</td>
<td>Email</td>
<td>Settings</td>
</tr>
<c:forEach items="${userLiat}" var="user">
<tr>
<td>${user.mobile}</td>
<td>${user.fname}</td>
<td>${user.lname}</td>
<td>${user.email}</td>
<td>
<a href="<c:url value='/edit/${user.mobile}'/>">Edit</a>
<a href="<c:url value='/details/${user.mobile}'/>">Details</a>
<a href="<c:url value='/delete/${user.mobile}'/>">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>