<%-- 
    Document   : login
    Created on : Sep 20, 2017, 2:04:36 PM
    Author     : 671978
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html"/>
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
<c:import url="footer.html"/>
