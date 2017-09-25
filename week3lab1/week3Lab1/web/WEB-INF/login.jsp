<%-- 
    Document   : login
    Created on : Sep 20, 2017, 2:04:36 PM
    Author     : 671978
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="LoginPage" method="post">
            Username: <input type="text" name="user" value=${user}><br>
            Password: <input type="text" name="pass" value=${pass}><br>
            <input type="submit" value="Submit">
        </form>
        
        <div>${ErrorMessage}</div>
        <div>${incorrect}</div>
        <div>
            ${bye}  
        </div>
    </body>
</html>
