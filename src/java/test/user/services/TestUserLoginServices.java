
package test.user.services;

import dao.UserDaoImpl;
import exception.UserBlockException;
import model.User;
import service.UserServices;
import service.UserServicesImpl;


public class TestUserLoginServices {
    public static void main(String[] args){
        UserServices userService= new UserServicesImpl();
        
        
        try{
            User u=userService.login("rohit", "r123");
            System.out.println("User: "+u);
            if(u == null){
                System.out.println("User did not Registred Yet! Please try to Register again");
            } else{
                System.out.println("Succcessfull Login!");
            } 
        }catch(UserBlockException ue){
            //Bind Error msg in JSP
            System.out.println("User has been blocked : \n"+ue.getMessage()); 
        }       
            
        
    }
}
