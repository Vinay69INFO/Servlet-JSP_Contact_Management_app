/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.contact;

import dao.ContactDao;
import dao.ContactDaoImpl;
import model.Contact;

/**
 *
 * @author vinay
 */
public class TestUpdateContact {
    public static void main(String[] args) {
        
        ContactDao cd=new ContactDaoImpl();
        Contact c=new Contact();
        c.setUserId(3);
        c.setName("Prachi");
        c.setPhoneNo("123456789");
        c.setEmail("prachi@gmail.com");
        c.setAddress("Gahra Nala");
        c.setRemark("Sister");
        c.setContactId(6);
        
        cd.update(c);
        c=cd.findById(6);
        System.out.println("Updated Contact : "+c);
    }
}
