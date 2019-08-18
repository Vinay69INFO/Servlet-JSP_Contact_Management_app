/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.user;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;

/**
 *
 * @author vinay
 */
public class TestUserDeleteById {
    public static void main(String[] args) {
        UserDao ud=new UserDaoImpl();
        User u=new User();
        u.setUserId(2);
        
        ud.deleteById(2);
    }
}
