
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
        <%
            if(request.getParameter("error")!=null){
                out.println(request.getParameter("error"));
            }
            
        %>
        <div class="container" style="border: 2px red solid ">
            <h2 style="margin: 20px 20px;">User Registration</h2>
            <form action="./userRegi" method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Name</label>
                    <input type="text" class="form-control" name="name" placeholder="Enter Your Full Name">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">Phone Number</label>
                    <input type="text" class="form-control" name="phoneNo" placeholder="Phone Number">
                </div>
            </div>
            <div class="form-group">
                <label for="inputAddress">Email Id</label>
                <input type="email" class="form-control" name="emailId" placeholder="Email Id">
            </div>
            <div class="form-group">
                <label for="inputAddress2">Address</label>
                <textarea type="text" class="form-control" name="address" placeholder="Address"></textarea>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">User Name</label>
                    <input type="text" class="form-control" name="userName" placeholder="User Name">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">Password</label>
                    <input type="text" class="form-control" name="password" placeholder="Password">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Save</button>
        </form>
        </div>
        
        
    </body>
</html>
