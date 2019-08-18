
package test.user;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;


public class TestUserfindById {
    public static void main(String[] args) {
        UserDao ud=new UserDaoImpl();
        //User u=new User();
        User u=ud.findById(5);
        System.out.println("User : "+u);
        
        
    }
 
}
