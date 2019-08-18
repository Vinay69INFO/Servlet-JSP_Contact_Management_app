<%-- 
    Document   : login
    Created on : 11 Aug, 2019, 11:12:08 PM
    Author     : vinay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        
         <jsp:include page="common_Lib/cdnLink.jsp" />
    </head>
    <body>
        <div class="container-fluid">
            <nav class="navbar navbar-dark bg-dark  navbar-expand-md">
                <a class="navbar-brand" href="#">Contact App</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#homePageNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="homePageNavbar">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home</a>
                        </li>
                        <li class="nav-item">

                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="userReg.jsp">Sign-UP</a>
                        </li>
                    </ul>
                </div>
            </nav>

        </div>
        
        <h1>
        <%
            if(request.getParameter("error")!=null){
                out.println(request.getParameter("error"));
            }
        %>
        </h1>
        <div class="container login-container-border">
            <h1 align="center">Sign In</h1>
            <form action="loginUser" method="Post">
            <div class="form-group">
                <label for="exampleInputEmail1">User Name</label>
                <input type="text" class="form-control" name="userName" placeholder="Enter User Name">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" class="form-control" name="password" placeholder="Password">
            </div>
            
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
            
        </div>
        
    </body>
</html>
