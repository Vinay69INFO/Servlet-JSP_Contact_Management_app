
package test.contact;

import dao.ContactDao;
import dao.ContactDaoImpl;
import model.Contact;


public class TestContactfindById {
    public static void main(String[] args) {
        ContactDao cd=new ContactDaoImpl();
        Contact c=cd.findById(1);
        System.out.println(" "+c);
    }
}
