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
public class TestSaveContact {
    public static void main(String[] args) {
        ContactDao cd=new ContactDaoImpl();
        Contact c=new Contact();
        c.setUserId(3);
        c.setName("Vinay");
        c.setPhoneNo("588372482");
        c.setEmail("tiwari.vinay@gmail.com");
        c.setAddress("Maruti nagar");
        c.setRemark("contact app");
        
        cd.save(c);
    }
}
