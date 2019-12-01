<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register your details here</h2>
<form method="post" action="/Project1/create">
<table>
<tr><td>First name</td><td><input type="text" name="fname"/></td></tr>
<tr><td>Last name</td><td><input type="text" name="lname"/></td></tr>
<tr><td>Email</td><td><input type="text" name="email"/></td></tr>
<tr><td>Mobile num</td><td><input type="text" name="mobile"/></td></tr>
<tr><td><input type="reset" value="Clear"/></td><td><input type="submit" value="Regsiter"/></td></tr>
</table>
</form>
</body>
</html>