<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body {
  height: 50vh;
  background: url("https://animemotivation.com/wp-content/uploads/2019/01/dragon-maid-tohru-confused-face.jpg") 50% fixed;
  background-size: cover;
}
    p.EMessage{
        text-align: center;
        color: fuchsia;
        font-family: cursive;
    }
    
    div.TMessage{
         text-align: center;
         font-family: fantasy;
    }
    div:hover{
      background: grey;
    }
    a:hover{
      background: pink;
    }
    
</style>

</head>
<body>

<marquee behavior="scroll" direction="left" height= 50% width= 80% scrolldelay="0">
   <p class = "EMessage">Error Error! You are either not registered, or you have keyed in the wrong account details! Please use the following links below.</p>
  </marquee>    
  
  <div class = "TMessage">
    <hr>
    <a href ="/CarCareServicesFinal/Registration.html">Click here to register a new account instead!</a>
    <hr>
    </div>
    
    <div class = "TMessage">
    <hr>
    <a href ="/CarCareServicesFinal/index.html">Click here to go back to the index page instead!</a>
    <hr>
    </div>
</body>
</html>