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
public class TestDeleteUser {
    public static void main(String[] args) {
        UserDao ud=new UserDaoImpl();
        User u=new User();
        u.setName("vinay");
        u.setPhoneNo("879374937");
        u.setEmailId("tiwari.vinay@gmail.com");
        u.setAddress("maruti nagar");
        u.setUserName("vin");
        u.setPassword("v123");
        u.setRole(2);
        u.setLoginStatus(1);
        u.setUserId(1);
        
        ud.delete(u);
    }
}
