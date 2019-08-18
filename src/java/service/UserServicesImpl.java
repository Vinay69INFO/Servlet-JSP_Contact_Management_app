package service;

import connection.DB_Connection;
import dao.UserDao;
import dao.UserDaoImpl;
import exception.InvalidPasswordException;
import exception.UserBlockException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;
import model.User;

public class UserServicesImpl implements UserServices {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void userRegistration(User u) {
        userDao.save(u);
    }

    @Override
    public User login(String userName, String password) throws UserBlockException, InvalidPasswordException {
        User u = new User();
        String sql = "SELECT userId,name,phoneNo,emailId,address,userName,password,role,loginStatus "
                + "FROM user WHERE username=?";
        try {
            PreparedStatement pst = DB_Connection.getConnection().prepareStatement(sql);
            pst.setString(1, userName);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                u.setUserId(rs.getInt("userId"));
                u.setName(rs.getString("name"));
                u.setPhoneNo(rs.getString("phoneNo"));
                u.setEmailId(rs.getString("emailId"));
                u.setAddress(rs.getString("address"));
                u.setUserName(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getInt("role"));
                u.setLoginStatus(rs.getInt("loginStatus"));
            }
            if (u.getUserName().equals(userName) && u.getPassword().equals(password)) {
                    if (u.getLoginStatus().equals(UserServices.LOGIN_STATUS_BLOCK)) {
                        throw new UserBlockException("User hasbeen Blocked! Please contact to Admin");
                    } else {
                        return u;
                    }
            } else {
                throw new InvalidPasswordException("Invalid Password!");
            }
        } catch (SQLException ex) {
            return null;
        }catch (NullPointerException ne) {
            return null;
        }

    }

    
}
