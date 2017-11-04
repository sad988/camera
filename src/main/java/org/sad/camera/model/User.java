package org.sad.camera.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    private int userId;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String address;
    private String level;

    public User() {
    }

    public User(int userId, String username, String password, String fullname, String email, String address, String level) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.level = level;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
