/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DB_Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;

/**
 *
 * @author vinay
 */
public class ContactDaoImpl implements ContactDao{

    @Override
    public void save(Contact c) {
        String sql="INSERT INTO contact ("
                + "`userId`, "
                + "`name`, "
                + "`phoneNo`, "
                + "`email`, "
                + "`address`, "
                + "`remark`)"
                + " VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst=DB_Connection.getConnection().prepareStatement(sql);
            pst.setInt(1,c.getUserId());
            pst.setString(2, c.getName());
            pst.setString(3, c.getPhoneNo());
            pst.setString(4, c.getEmail());
            pst.setString(5, c.getAddress());
            pst.setString(6, c.getRemark());
            
            pst.executeUpdate();          
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Contact c) {
        String sql="UPDATE contact SET "
                + "name=?, "
                + "phoneNo=?, "
                + "email=?, "
                + "address=?,  "
                + "remark=? "
                + "WHERE contactId=? ";
        System.out.println("sql======: "+sql);
        try{
            PreparedStatement pst=DB_Connection.getConnection().prepareStatement(sql);
            //pst.setInt(1, c.getUserId());
            pst.setString(1,c.getName());
            pst.setString(2,c.getPhoneNo());
            pst.setString(3,c.getEmail());
            pst.setString(4,c.getAddress());
            pst.setString(5,c.getRemark());
            pst.setInt(6,c.getContactId());
            
            pst.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Contact c) {
        this.deleteById(c.getContactId());
    }

    @Override
    public void deleteById(Integer contactId) {
        String sql="DELETE FROM contact WHERE contactId=?";
        try{
            PreparedStatement pst=DB_Connection.getConnection().prepareStatement(sql);
            pst.setInt(1, contactId);
            pst.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Contact findById(Integer contactId) {
        
        Contact c=new Contact();        
        String sql="SELECT * FROM contact WHERE contactId=? ";
        try{
            PreparedStatement pst=DB_Connection.getConnection().prepareStatement(sql);
            pst.setInt(1, contactId);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                c.setContactId(rs.getInt(1));
                c.setUserId(rs.getInt(2));
                c.setName(rs.getString(3));
                c.setPhoneNo(rs.getString(4));
                c.setEmail(rs.getString(5));
                c.setAddress(rs.getString(6));
                c.setRemark(rs.getString(7));
            }
            
        } catch(SQLException e){
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public List<Contact> findByProperity(String properityName, String properityValue) {
        List<Contact> contacts=new ArrayList<Contact>();
        String sql="SELECT contactId,userId,name,phoneNo,email,address,remark "
                + "FROM contact WHERE "+properityName+"=?";
        try{
            PreparedStatement pst=DB_Connection.getConnection().prepareStatement(sql);
            pst.setString(1, properityValue);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                Contact c=new Contact();
                c.setContactId(rs.getInt(1));
                c.setUserId(rs.getInt(2));
                c.setName(rs.getString(3));
                c.setPhoneNo(rs.getString(4));
                c.setEmail(rs.getString(5));
                c.setAddress(rs.getString(6));
                c.setRemark(rs.getString(7));
                contacts.add(c);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return contacts;
       
    }

    @Override
    public List<Contact> findAll() {
        List<Contact> contacts=new ArrayList<Contact>();
        String sql="SELECT userId, name, phoneNo, email,address,remark "
                + " FROM contact";
        try{
           PreparedStatement pst=DB_Connection.getConnection().prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                Contact c=new Contact();
                c.setUserId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setPhoneNo(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setRemark(rs.getString(6));
                contacts.add(c);
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
         return contacts;   
    }
    
}
