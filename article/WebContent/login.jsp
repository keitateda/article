<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<title>login</title>
</head>

 <body>
  <h1>Brog Site</h1>
  <form action="login.do" method="post">
   <fieldset>
  
  <input name="email" placeholder="email"/>
  <input type="password"  name="password" placeholder="Password"/>
  <!--   <button>Login</button> -->
  <input type="submit" value="Login">
  
  </fieldset>
  <div align="left"><a href="signUp.html">Create New Account</a></div>
</form>
 </body>
</html>
