<%-- 
    Document   : Login
    Created on : 14-Sep-2021, 11:12:28 AM
    Author     : bhavin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <%@include  file="AllDesignComponent/Allcdn.jsp" %>
        <link href="AllDesignComponent/Style.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/a81368914c.js"></script>
    </head>
    <body>
        <img class="wave" src="img/wave.png">
        <div class="container">
            <div class="img">
                <img src="img/bg.svg">
            </div>
            <div class="login-content">
                <form action="LoginServlet" method="post">
                    <img src="img/avatar.svg">
                    <h2 class="title">Welcome</h2>
                    <div class="input-div one">
                        <div class="i">
                            <i class="fas fa-user"></i>
                        </div>
                        <div class="div">
                            <h5>Username</h5>
                            <input type="text" class="input">
                        </div>
                    </div>
                    <div class="input-div pass">
                        <div class="i"> 
                            <i class="fas fa-lock"></i>
                        </div>
                        <div class="div">
                            <h5>Password</h5>
                            <input type="password" class="input">
                        </div>
                    </div>
                    <a href="#">Forgot Password?</a>
                    <input type="submit" class="btn" value="Login">
                </form>
            </div>
        </div>

        <script src="AllDesignComponent/app.js"></script>
        <%@include file = "AllDesignComponent/Footer.jsp"%>
    </body>
</html>
