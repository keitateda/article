<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
     <head>
          <meta charset=UTF-8>
          <title>login</title>
     </head>
     <body>
<h3>ログイン</h3>
     	<form method="POST" action= "login">
   		  <table>
  		   <tr>
  			  <td>
  		     	<b>email:</b>
 		      </td>
 		      <td>
  		   		<input name = "email">
  		   	  </td>
  		   </tr>
  		   <tr>
  		   	  <td>
  		   		<b>pass:</b>
  		   	  </td>
    	 	  <td>
  		 		<input type ="password" name = "pass">
  		 	  </td>
  		 	</tr>
  		 </table>
     		<input type= "submit" value = "ログイン">
     </form>
     </body>
</html>