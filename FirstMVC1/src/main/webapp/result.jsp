<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
<%  //scriptlet tag

out.println(session.getAttribute("i1")+"    "+session.getAttribute("i2")+"    "+session.getAttribute("i3"));

%>
</body>
</html>