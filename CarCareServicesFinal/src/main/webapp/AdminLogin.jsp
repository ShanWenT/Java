<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in page</title>
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

<div class="admin-login">
		<div class = "login-box">
  <h1>Admin Login Page</h1>
  
    <form method="post" action="AdminLogin">
     <div class ="user-box">
     
     <label>Username</label>
     <input type="text" name ="adminUserName" required>
    </div>
    <br>
    <div class ="user-box">
     <label>Password</label>
     <input type="password" name ="adminPassword" required>
    </div>
    <br>
    <div class ="submit-box">
     <input type="submit" value="login">
    </div>
     </form>
   </div>
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