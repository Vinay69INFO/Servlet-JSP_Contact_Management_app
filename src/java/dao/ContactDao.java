package dao;


import java.util.List;
import model.Contact;


public interface ContactDao {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Contact c);
    public void deleteById(Integer contactId);
    public Contact findById(Integer contactId);
    public List<Contact> findByProperity(String properityName, String properityValue);
    public List<Contact> findAll();
}
