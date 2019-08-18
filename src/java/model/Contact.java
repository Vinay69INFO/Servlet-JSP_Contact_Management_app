
package model;


public class Contact {
    private Integer contactId;
    private Integer userId;
    private String name;
    private String phoneNo;
    private String email;
    private String address;
    private String remark;

    public Contact() {
    }

    
    public Contact(Integer userId, String name, String phoneNo, String email, String address, String remark) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.remark = remark;
    }
  

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Contact{" + "contactId=" + contactId + ", userId=" + userId + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", address=" + address + ", remark=" + remark + '}';
    }
    
    
}
