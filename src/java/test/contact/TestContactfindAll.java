
package test.contact;

import dao.ContactDao;
import dao.ContactDaoImpl;
import java.util.List;
import model.Contact;
import model.User;


public class TestContactfindAll {
    public static void main(String[] args) {
        ContactDao cd=new ContactDaoImpl();
        List<Contact> users=cd.findAll();
        for(Contact u: users){
            System.out.println(u);
        }        
        
    }
}
