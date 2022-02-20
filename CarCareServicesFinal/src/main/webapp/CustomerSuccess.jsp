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
	out.println("Welcome " + session.getAttribute("username"));
%>
   <a href ="/CarCareServicesFinal/SelectService.html">Request Servicing</a><br>

<form action= "CustomerLogout"><input type="submit" value="Logout"></form>
<a href ="/CarCareServicesFinal/CustomerChangePassword.html">Change Password </a>
</body>
</html>