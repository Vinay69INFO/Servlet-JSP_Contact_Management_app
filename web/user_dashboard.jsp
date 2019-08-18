<%-- 
    Document   : index  
    Created on : Oct 7, 2018, 12:19:53 PM
    Author     : vivek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
         <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <!-- Font Awesome lib-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- My Own css-->
        <u:url var="url_css" value="/static/css/index_style.css"></u:url>
        <link rel="stylesheet" href="${url_css}" type="text/css">

        <title>User home page</title>

     


    <body>
        <%-- Header Section --%>
        <!-- Start Home section -->
        <header id="home">
            <jsp:include page="include/header.jsp" />
        </header>    
        <!-- End Home section -->


        <%-- Body Area --%>
        <section class="section">


            <center><strong class="text-warning">User DashBoard To:Do</strong></center>
        </section>


        <%-- Footer section --%>
        <footer id="footer" class="offset">
            <jsp:include page="include/footer.jsp" />
        </footer>



        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    </body>
</html>
