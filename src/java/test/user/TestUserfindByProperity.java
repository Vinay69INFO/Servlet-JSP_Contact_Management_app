
package test.user;

import dao.UserDao;
import dao.UserDaoImpl;
import java.util.List;
import model.User;


public class TestUserfindByProperity {
    public static void main(String[] args) {
        UserDao ud=new UserDaoImpl();
        //User u=new User();
        
        List<User> users=ud.findByProperity("role", "2");
        for(User u: users){
            System.out.println(u);
        }
    }
}
