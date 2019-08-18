/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinay
 */
@WebServlet(name = "logOutController", urlPatterns = {"/logout"})
public class logOutController extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        req.getSession().invalidate();
        res.sendRedirect("login.jsp?msg="+"User LoggedOut Successfully!");
    }
}
