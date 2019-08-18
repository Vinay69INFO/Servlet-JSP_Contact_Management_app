
package dao;
import java.util.List;
import model.User;

public interface UserDao {
    public void save(User u);
    public void update(User u);
    public void delete(User u);
    public void deleteById(Integer userId);
    public User findById(Integer userId);
    public List<User> findByProperity(String propertyName, String properityValue);
    public List<User> findAll();
}
