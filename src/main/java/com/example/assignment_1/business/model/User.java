package com.example.assignment_1.business.model;

import com.example.assignment_1.data.model.UserDB;
import com.example.assignment_1.helper.UserRole;

public class User {
    private Long id;

    private String username;
    private String password;
    protected UserRole role;

    public User() {
    }

    public User(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(UserDB userDB) {
        if (userDB != null) {
            this.id = userDB.getId();
            this.username = userDB.getUsername();
            this.password = userDB.getPassword();
            this.role = userDB.getRole();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
