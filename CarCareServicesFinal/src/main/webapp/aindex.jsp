<%
if(session.getAttribute("name")==null){
response.sendRedirect("/CarCareServicesFinal/alogin.jsp");
}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>aindex</title>
</head>
<body>
<h1>Welcome</h1><br>

<h3 style="text-align: right">
<a href="/CarCareServicesFinal/achangepass.jsp">Change password</a>
<a href="logout">Logout</a>
<a href="#" style="background-color: lightseagreen"><%=session.getAttribute("name")%></a>
</h3>
</body>
</html>