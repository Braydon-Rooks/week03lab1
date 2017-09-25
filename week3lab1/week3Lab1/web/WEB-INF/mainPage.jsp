<%-- 
    Document   : mainPage
    Created on : Sep 20, 2017, 2:04:52 PM
    Author     : 671978
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h1>Main Page</h1>
        Hello,${user} <a href="MainPage?user=${user}">logout</a>
        
    </body>
</html>
