/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ContactDao;
import dao.ContactDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contact;
import model.User;

/**
 *
 * @author vinay
 */
@WebServlet(name = "UpdateContact", urlPatterns = {"/updateContact"})
public class UpdateContact extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        ContactDao cd=new ContactDaoImpl();
        
        Integer contactId=Integer.parseInt(req.getParameter("contactId"));
        System.out.println("contactId=========="+contactId);
        String name =req.getParameter("name");
        String phoneNo =req.getParameter("phoneNo") ;
        String email =req.getParameter("email");
        String address =req.getParameter("address");
        String remark =req.getParameter("remark");
        Contact c = new Contact();
        c.setContactId(contactId);
        c.setName(name);
        c.setPhoneNo(phoneNo);
        c.setEmail(email);
        c.setAddress(address);
        c.setRemark(remark);
        
       cd.update(c);
        res.sendRedirect("contactList.jsp?msg="+"Contact Update Successfully!");

        
    }
}
