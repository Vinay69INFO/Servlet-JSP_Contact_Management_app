/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.contact;

import dao.ContactDao;
import dao.ContactDaoImpl;
import java.util.List;
import model.Contact;

/**
 *
 * @author vinay
 */
public class TestContactfindByProperity {
    public static void main(String[] args) {
        ContactDao contactDao=new ContactDaoImpl();
        List<Contact> contacts=contactDao.findByProperity("userId", "3");
        for(Contact c: contacts){
            System.out.println("contact: "+c);
        }
    }
}
