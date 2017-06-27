<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<title>login</title>
</head>

 <body>
 <form action="login.do" method="post">
  <h1>Brog Site</h1>
   <fieldset>
  <input name="email" placeholder="email"/>
  <input type="password"  name="password" placeholder="Password"/>
  <!--   <button>Login</button> -->
  <input type="submit" value="Login">
  
  </fieldset>
  <div align="left"><a href="signUp.html">Create New Account</a></div>
  <p class="error"><br>${error}</p>
</form>
 </body>
</html>
