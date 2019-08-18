/*
 * 
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
import javax.servlet.http.HttpSession;
import model.Contact;
import model.User;


@WebServlet(name = "ContactSaveController", urlPatterns = {"/ContactSave"})
public class ContactSaveController extends HttpServlet {
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        ContactDao cd=new ContactDaoImpl();
        User u=(User) req.getSession().getAttribute("user");
        
        System.out.println("user========"+req.getSession().getAttribute("user"));
        Integer userId=u.getUserId();
        System.out.println("=========User Id : "+userId);

        String name =req.getParameter("name");
        String phoneNo =req.getParameter("phoneNo") ;
        String email =req.getParameter("email");
        String address =req.getParameter("address");
        String remark =req.getParameter("remark");
        Contact contact=new Contact(userId, name, phoneNo, email, address, remark);
        
        cd.save(contact);
        res.sendRedirect("contactList.jsp?msg="+"Contact Save Successfully!");

    }
}
