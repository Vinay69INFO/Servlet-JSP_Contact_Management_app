
package test.user;

import dao.UserDao;
import dao.UserDaoImpl;
import java.util.List;
import model.User;


public class TestSaveUser {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        User u=new User();
        u.setName("India");
        u.setPhoneNo("87937493");
        u.setEmailId("rohit@gmail.com");
        u.setAddress("Satna");
        u.setUserName("india");
        u.setPassword("i123");
        u.setRole(1);
        u.setLoginStatus(1);
        
        ud.save(u);
        List<User> users= ud.findAll();
        
        for(User ul : users){
            System.out.println("Users : " +ul);
        }
    }
}
