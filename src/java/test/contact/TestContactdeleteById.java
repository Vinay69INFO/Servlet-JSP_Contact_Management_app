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
public class TestContactdeleteById {
    public static void main(String[] args) {
        ContactDao contactDao=new ContactDaoImpl();
        Contact c=new Contact();
        contactDao.deleteById(6);
        List<Contact> contacts=contactDao.findAll();
        for(Contact contact:contacts){
            System.out.println(contact);
        }
    }
}
