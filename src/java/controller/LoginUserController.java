/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exception.InvalidPasswordException;
import exception.UserBlockException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import service.UserServices;
import service.UserServicesImpl;

/**
 *
 * @author vinay
 */
@WebServlet(name = "LoginUser", urlPatterns = {"/loginUser"})
public class LoginUserController extends HttpServlet {
    UserServices userService=new UserServicesImpl();
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
        HttpSession session=req.getSession();
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        try {
            User u=userService.login(userName,password);
            
            
            if(u == null){
                System.out.println("User did not Registred Yet! Please try to Register again");
                res.sendRedirect("userReg.jsp?error="+"User did not Registred Yet! Please try to Register");
            }
            else if(u != null){
                if(u.getRole().equals(UserServices.ADMIN_ROLE)){
                    System.out.println("Admin login Successfully");
                    this.addUserInSession(u,session);
                    res.sendRedirect("AdminHomePage.jsp");
                }
                else{
                    System.out.println("user LOGIN successfull!");
                    this.addUserInSession(u,session);
                    res.sendRedirect("UserHomePage.jsp");                    
                }
            }
                
        } catch (UserBlockException ue) {
            System.out.println("User has been blocked : \n"+ue.getMessage());
            res.sendRedirect("login.jsp?error="+ue.getMessage());
            
        } catch(InvalidPasswordException ip){
            System.out.println("User has been blocked: "+ ip.getMessage());
            res.sendRedirect("login.jsp?error="+ip.getMessage());
        }
        
    }
    
    public void addUserInSession(User u,HttpSession session){
        session.setAttribute("user", u);
        System.out.println("session : "+session);
        
    }
}
