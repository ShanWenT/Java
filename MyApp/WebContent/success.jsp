<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successfully login</title>
</head>
<body>
<%
	out.println("Welcome " + session.getAttribute("un"));
%>
</body>
</html>