<%
if(session.getAttribute("name")==null){
response.sendRedirect("/CarCareServicesFinal/AdminLogin.jsp");
}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import = "com.ncs.project.Model" %> 
<%@ page import="java.sql.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
Statement statement = null;
ResultSet resultSet = null;


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Index</title>
<style>
body{
  background: linear-gradient(45deg, #49a09d, #5f2c82);
}
a
{
	text-decoration: underline;
	color: black;
	padding: 5px 10px;
	border: 2px solid gold;
	background-color: white;
}

a:hover
{
	background-color: blue;
}
</style>
</head>
<body>
<h1>Welcome</h1><br>

<h3 style="text-align: right">
<a href="/CarCareServicesFinal/AdminChangePassword.jsp">Change password</a>
<a href="/CarCareServicesFinal/AdminLogout">Logout</a>
<a href="#" style="background-color: lightseagreen"><%=session.getAttribute("name")%></a>
		<br><br>
		<table align="center"border="1">
		<th>
			Username
		</th>

		<th>
			Car Model
		</th>
		<th>
			Car Vehicle Number
		</th>
		<th>
			Services
		</th>
		<th>
			Status
		</th>
		<%
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root"); // test, Sliver@911

			String s ="SELECT * FROM booking";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
		%>
		<tr bgcolor="#DEB887">
			<td><%=rs.getString("username") %></td>
			<td><%=rs.getString("carModel") %></td>
			<td><%=rs.getString("carVH") %></td>
			<td><%=rs.getString("services") %></td>
			<td><%=rs.getString("status") %></td>
			
		</tr>
		
		<% 
			}

		}
	
		catch (Exception e) {
		e.printStackTrace();
		}
	

		%>
		</table>

</h3>
</body>
</html>