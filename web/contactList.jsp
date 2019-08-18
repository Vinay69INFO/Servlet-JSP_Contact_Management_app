<%-- 
    Document   : contactList
    Created on : 18 Aug, 2019, 10:55:26 AM
    Author     : vinay
--%>

<%@page import="model.Contact"%>
<%@page import="dao.ContactDaoImpl"%>
<%@page import="dao.ContactDao"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page import="dao.UserDao"%>
<%@page import="dao.UserDaoImpl"%>
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

        <div class="container">
            <h2>Wellcome: ${user.name}</h2>
            <h4 style="color: blue;">
                <%
                    if (request.getParameter("msg") != null) {
                        out.println(request.getParameter("msg"));
                    }
                %>
            </h4>
            <table class="table table-dark table-striped">
                <thead>
                    <tr>
                        <th>User Id</th>
                        <th>Name</th>
                        <th>PhoneNo</th>
                        <th>Email Id</th>
                        <th>Address</th>
                        <th>Remark</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        User u = (User) request.getSession().getAttribute("user");

                        String userId = "" + u.getUserId();
                        ContactDao contactdao = new ContactDaoImpl();
                        List<Contact> contactList = contactdao.findByProperity("userId", userId);
                        if (contactList != null) {
                            int count = 0;
                            ListIterator contactIter = contactList.listIterator();
                            while (contactIter.hasNext()) {
                                Contact c = (Contact) contactIter.next();


                    %>

                    <tr>

                        <td><%=++count%></td>
                        <td><%=c.getName()%></td>
                        <td><%=c.getPhoneNo()%></td>
                        <td><%=c.getEmail()%></td>
                        <td><%=c.getAddress()%></td>
                        <td><%=c.getRemark()%></td>
                        <td>
                            <a href="editContact.jsp?contactId=<%=c.getContactId()%>">Edit</a>&nbsp;|&nbsp;
                            <a href="deleteContact?contactId=<%=c.getContactId()%>">Delete</a></td>
                    </tr>
                    <%}
                    } else {%>

                    <tr><td colspan="10"><h3 class="text-center">No Record Found!</h3></td><tr>

                        <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
