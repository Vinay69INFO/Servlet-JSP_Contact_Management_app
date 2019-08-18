/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.user;

import dao.UserDao;
import dao.UserDaoImpl;
import java.util.List;
import model.User;

/**
 *
 * @author vinay
 */
public class TestUserfindAll {
    public static void main(String[] args) {
        UserDao ud=new UserDaoImpl();
        List<User> users=ud.findAll();
        for(User u: users){
            System.out.println(u);
        }
    }
}
