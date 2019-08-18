
package service;

import exception.InvalidPasswordException;
import exception.UserBlockException;
import model.Contact;
import model.User;


public interface UserServices {
    public static final Integer ADMIN_ROLE=1;
    public static final Integer USER_ROLE=2;
    public static final Integer LOGIN_STATUS_ACTIVE=1;
    public static final Integer LOGIN_STATUS_BLOCK=2;


    public void userRegistration(User u);
    public User login(String userName,String password) throws UserBlockException, InvalidPasswordException;
    
    
}
