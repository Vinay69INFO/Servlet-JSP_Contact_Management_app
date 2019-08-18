
package dao;

import connection.DB_Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;


public class UserDaoImpl implements UserDao{

    @Override
    public void save(User u) {
        String sql="INSERT INTO user "
                + "(`name`, "
                + "`phoneNo`, "
                + "`emailId`, "
                + "`address`, "
                + "`userName`, "
                + "`password`, "
                + "`role`, "
                + "`loginStatus`)"
                + "VALUES("
                + "'"+u.getName()+"',"
                + "'"+u.getPhoneNo()+"',"
                + "'"+u.getEmailId()+"',"
                + "'"+u.getAddress()+"',"
                + "'"+u.getUserName()+"',"
                + "'"+u.getPassword()+"',"
                + "'"+u.getRole()+"',"
                + "'"+u.getLoginStatus()+"')";
        try {
            DB_Connection.getStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(User u) {
        String sql=String.format("UPDATE user "
                + "SET name='%s',phoneNo='%s', emailId='%s', address='%s', userName='%s',password='"
                + "%s', role='%d',loginStatus='%d' WHERE userId='"+u.getUserId()+"' ",u.getName(),u.getPhoneNo(),u.getEmailId(),u.getAddress(),u.getUserName(),
                u.getPassword(),u.getRole(),u.getLoginStatus());
        try{
            DB_Connection.getStatement().executeUpdate(sql);
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public void delete(User u) {
        this.deleteById(u.getUserId());
    }

    @Override
    public void deleteById(Integer userId) {
        try {
            String sql="DELETE FROM user "
                    + "WHERE userId='"+userId+"'";
            DB_Connection.getStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public User findById(Integer userId) {
        
        User u=new User();
        
        String sql="SELECT * FROM user WHERE userId='"+userId+"'";
        try {
            ResultSet rs=DB_Connection.getStatement().executeQuery(sql);
            while(rs.next()){
                u.setUserId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPhoneNo(rs.getString(3));
                u.setEmailId(rs.getString(4));
                u.setAddress(rs.getString(5));
                u.setUserName(rs.getString(6));
                u.setPassword(rs.getString(7));
                u.setRole(rs.getInt(8));
                u.setLoginStatus(rs.getInt(9));                             
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return u;
    }

    @Override
    public List<User> findByProperity(String propertyName, String properityValue) {
        
        List<User> users=new ArrayList<User>();
        String sql="SELECT userId,name, phoneNo, emailId, address, userName, password, role, loginStatus FROM user"
                + " WHERE "+propertyName+"='"+properityValue+"'";
        System.out.println("===SQL = : "+sql);
        Integer i=0;
        try {
            ResultSet rs=DB_Connection.getStatement().executeQuery(sql);
            while(rs.next()){
                User u=new User();
                u.setUserId(rs.getInt("userId"));
                u.setName(rs.getString("name"));
                u.setPhoneNo(rs.getString("phoneNo"));
                u.setEmailId(rs.getString("emailId"));
                u.setAddress(rs.getString("address"));
                u.setUserName(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getInt("role"));
                u.setLoginStatus(rs.getInt("loginStatus"));
                users.add(u);
                i++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("===========i: "+i);
        return users;
    }

    @Override
    public List<User> findAll() {
        List<User> users=new ArrayList<User>();
        String sql="SELECT userId, name, phoneNo,emailId, address, userName, password, role, loginStatus  "
                + "FROM user";
        try{
            ResultSet rs=DB_Connection.getStatement().executeQuery(sql);
            while(rs.next()){
                User u=new User();
                u.setUserId(rs.getInt("userId"));
                u.setName(rs.getString("name"));
                u.setPhoneNo(rs.getString("phoneNo"));
                u.setEmailId(rs.getString("emailId"));
                u.setAddress(rs.getString("address"));
                u.setUserName(rs.getString("userName"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getInt("role"));
                u.setLoginStatus(rs.getInt("loginStatus"));
                users.add(u);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return users;
    }
    
}
