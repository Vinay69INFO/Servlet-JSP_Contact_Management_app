
package model;


public class User {
    private Integer  userId;
    private String name;
    private String phoneNo;
    private String emailId;
    private String address;
    private String userName;
    private String password;
    private Integer role;
    private Integer loginStatus;

    public User() {
    }
    
    public User(String userName, String password){
        this.userName=userName;
        this.password=password;
    }
    
    public User(String name, String phoneNo, String emailId, String address, String userName, String password, Integer role, Integer loginStatus) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.loginStatus = loginStatus;
    }
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name=" + name + ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", address=" + address + ", userName=" + userName + ", password=" + password + ", role=" + role + ", loginStatus=" + loginStatus + '}';
    }

    public Object getUserName(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
