<%-- 
    Document   : contactSave
    Created on : 18 Aug, 2019, 12:03:01 AM
    Author     : vinay
--%>

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

                            <a class="nav-link" href="contactSave.jsp">Add Contact</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contactList.jsp">Contact List</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="logout">LogOut</a>
                        </li>
                    </ul>
                </div>
            </nav>

        </div>
        <div class="container" style="border: 2px solid red" >
            <form action="ContactSave" method="Post">
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" name="name" placeholder="Please Enter your Name">
                    </div>

                </div>
                <div class="form-group">
                    <label for="phoneNo">PhoneNo</label>
                    <input type="text" class="form-control" name="phoneNo" placeholder="Please enter your phoneNo">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email" placeholder="Enter your email">
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="address">address</label>
                        <input type="text" class="form-control" name="address">
                    </div>
                    <div class="form-group col-md-2">
                        <label for="remark">Remark</label>
                        <input type="text" class="form-control" name="remark">
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Save</button>
            </form>
        </div>
    </body>
</html>
