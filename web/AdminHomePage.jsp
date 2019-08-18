<%-- 
    Document   : AdminUser
    Created on : 12 Aug, 2019, 12:49:46 PM
    Author     : vinay
--%>

<%@page import="dao.UserDaoImpl"%>
<%@page import="dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

                            <a class="nav-link" href="userlist">User List</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="logout">Sign-UP</a>
                        </li>
                    </ul>
                </div>
            </nav>

        </div>
        
        <h3>Welcome: ${user.name} </h3>
        
    </body>
</html>
