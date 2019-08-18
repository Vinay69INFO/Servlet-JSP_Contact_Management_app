
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


@WebServlet(name = "DeleteController", urlPatterns = {"/deleteContact"})
public class DeleteController extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        ContactDao contactdao=new ContactDaoImpl();
        Integer contactId=Integer.parseInt(req.getParameter("contactId"));
        System.out.println("=============="+contactId);
        contactdao.deleteById(contactId);
        res.sendRedirect("contactList.jsp?msg="+"Contact Delete Successfully!");
    }
}
