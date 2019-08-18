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
public class TestUpdateUser {
    public static void main(String[] args) {
        UserDao ud= new UserDaoImpl();
        User u=new User();
        u.setName("Abhishek");
        u.setPhoneNo("879374937");
        u.setEmailId("tiwari.vinay@gmail.com");
        u.setAddress("Kharmai mandir");
        u.setUserName("abhi");
        u.setPassword("a123");
        u.setRole(2);
        u.setLoginStatus(1);
        u.setUserId(5);
        
        ud.update(u);
    }
    
    
    
}
