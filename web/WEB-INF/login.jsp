<%-- 
    Document   : login
    Created on : Sep 18, 2017, 7:50:47 PM
    Author     : 727334
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="login" method="post">
                Username: <input type="text" name="username" ><br>
                Password: <input type="text" name="password" ><br>
                <input type="submit">
            </form>
        </div>
        ${errorMessage}
    </body>
</html>
