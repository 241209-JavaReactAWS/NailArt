package com.Revature.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "account")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role", nullable = false)
    private UserRole role;

    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    @Column(name = "updated_on", nullable = false)
    private Date updatedOn;



    public User() {
    }

    public User(String fullName, String email, String phoneNumber, String password, UserRole role, Date createdOn, Date updatedOn) {
//        super();
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password=" + password + ", role=" + role + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
    }

}