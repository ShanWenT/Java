<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
    p.EMessage{
        text-align: center;
        color: fuchsia;
        font-family: cursive;
    }
    
    div.TMessage{
         text-align: center;
         font-family: fantasy;
    }
    
</style>

</head>
<body>

<marquee behavior="scroll" direction="left" height= 60% width= 80% scrolldelay="0">
   <p class = "EMessage">Error Error! You are either not registered, or you have keyed in the wrong account details! Please use the following links below.</p>
  </marquee>    
  
  <div class = "TMessage">
    <br>
    <hr>
    <a href ="/CarCareServicesFinal/Registration.html">Click here to register a new account instead!</a>
    <br>
    <hr>
    <a href ="/CarCareServicesFinal/index.html">Click here to go back to the index page instead!</a>
    <br>
    <hr>
    </div>
</body>
</html>