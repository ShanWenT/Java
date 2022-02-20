<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>alogin</title>
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">


<div class="admin-login">
	<center>
		<form method="post" action="alogin">
			<fieldset style="background-color: aquamarine; width: 20%; border: solid">
				<legend style="text-align: left">Admin Login</legend>
				<table>
					<tr>
						UserName: <input type="text" name="adminUserName" placeholder="UserName" required>
					</tr>
					<tr>
						Password: <input type="password" name="adminPassword" placeholder="Password" required><br>
					</tr>
					<tr>
						<input type="submit" name="loginSubmission">
					</tr>
				</table>
			</fieldset>
		</form>
	</center>
</div>


<script src="sweetalert2.min.js"></script>
<link rel="stylesheet" href="sweetalert2.min.css">

<script type="text/javascript">
	var status = document.getElementById("status").value;

if(status == "changepassed") 
	{
		swal.fire("Successfully changed password", "success");
	}
	
else if(status == "failed") 
	{
		swal.fire("Invalid User or Password, Try again", "error");
	}
else if(status == "invalid") 
	{
		swal.fire("Please fill in username & password", "error");
	}
</script>


</body>
</html>