<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Admin Password</title>
</head>
<body>

<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">

<div class="adminchangepass">
	<center>
		<form method="post" action="achangepass">
		<fieldset style="background-color: aquamarine; width: 25%; border: solid">
				<legend style="text-align: left">Admin Login</legend>
				<table>
					<tr>
						Enter UserName: <input type="text" name="adminUserName" placeholder="UserName" required><br>
					</tr>
					<tr>
						Enter Old Password: <input type="password" name="oldAdminPassword" placeholder=" Old Password" required><br>
					</tr>
					<tr>
						Enter New Password: <input type="password" name="adminPassword" placeholder=" New Password" required><br>
					</tr>
					<tr>
						<input type="submit" value="Change Admin Password">
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
	
if(status == "changefailed") 
	{
		swal.fire("Failed to set new password", "error");
	}
	

</script>

</body>
</html>