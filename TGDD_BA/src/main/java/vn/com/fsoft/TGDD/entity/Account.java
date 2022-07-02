package vn.com.fsoft.TGDD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Account {
    @Id
    @Column(name = "user_id", nullable = false)
    private Integer userID;
    @Column(name = "user_name", length = 50)
    private String userName;
    @Column(name = "full_name", length = 50)
    private String fullName;
    @Column(name = "password", length = 50)
    private String password;

    public Account() {
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(Integer userID, String userName, String fullName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
