package com.startupsdigidojo.demo.user;

@SuppressWarnings("unused")
public class User {
    private String username;
    private String email;
    private int id;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User(String username, String email, int id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }
}
