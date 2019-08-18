<%-- 
    Document   : userList
    Created on : 17 Aug, 2019, 12:57:09 PM
    Author     : vinay
--%>

<%@page import="java.util.Iterator"%>
<%@page import="dao.UserDaoImpl"%>
<%@page import="dao.UserDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        
        <div class="container">

            <table class="table table-dark table-striped" style="border: 2px sold red;">
                <thead>
                    <tr>
                        <th>User Id</th>
                        <th>Name</th>
                        <th>PhoneNo</th>
                        <th>Email Id</th>
                        <th>Address</th>
                        <th>User Name</th>
                        <th>Action</th>
                    </tr>
                </thead>

                <tbody>

                    <%
                        UserDao userDao = new UserDaoImpl();
                        List<User> userlist = userDao.findAll();
                        if (userlist != null) {

                            ListIterator userite = userlist.listIterator();
                            int count = 1;
                            while (userite.hasNext()) {
                                User users = (User) userite.next();
                    %> 

                    <tr>
                        <td><%=count++%></td>
                        <td><%=users.getName()%></td>
                        <td><%=users.getPhoneNo()%></td>
                        <td><%=users.getEmailId()%></td>
                        <td><%=users.getAddress()%></td>
                        <td><%=users.getUserName()%></td>
                        <td><select id="">
                                <option value="1" >Active</option>
                                <option value="2">Block</option>
                            </select>
                        </td>
                    </tr>

                    <%}
                    } else {%>

                    <tr><td colspan="10"><h3 class="text-center">No Record Found!</h3></td><tr>

                        <%}%>
                </tbody>


            </table>
    </body>
</html>
