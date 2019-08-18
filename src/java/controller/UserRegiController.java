
package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import service.UserServices;
import service.UserServicesImpl;

public class UserRegiController extends HttpServlet {
    
    UserServices userServices=new UserServicesImpl();
   
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String name =req.getParameter("name");
        String phoneNo =req.getParameter("phoneNo") ;
        String emailId =req.getParameter("emailId");
        String address =req.getParameter("address");
        String userName =req.getParameter("userName");
        String password =req.getParameter("password");
        User u=new User(name, phoneNo, emailId, address, userName, password, UserServices.USER_ROLE, UserServices.LOGIN_STATUS_ACTIVE);
        userServices.userRegistration(u);
    }
    

    
}
