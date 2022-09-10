<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Admin Password</title>
<style>
html{
  height:100%;
}
 body{
  margin:0;
  padding:0;
  font-family: cursive;
  background: darkslateblue;
 }
 
h1{
  text-align: center;
  color: ghostwhite;
}
.login-box {
  margin-top:10%;
  left: 30%;
  width: 30%;
  padding: 40px;
  background: black;
  box-sizing: border-box;
  box-shadow: 10px 10px 5px;
  border-radius: 10px;
}

.login-box, .user-box{
  position: relative;
}
.login-box{
    color: white;
}
</style>
</head>
<body>

<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">

   <div class="adminchangepass">
		<div class = "login-box">
  <h1>Admin Password Change Page</h1>
  
    <form method="post" action="AdminChangePassword">
    
     <div class ="user-box">
     <label>Username</label>
     <input type="text" name ="adminUserName" required>
    </div>
    <br>
    <div class ="user-box">
     <label>Old Password</label>
     <input type="password" name ="oldAdminPassword" required>
    </div>
    <br>
    <div class ="user-box">
     <label>New Password</label>
     <input type="text" name ="adminPassword" required>
    </div>
    <br>
    <div class ="submit-box">
     <input type="submit" value="Password change">
    </div>
     </form>
   </div>
	
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