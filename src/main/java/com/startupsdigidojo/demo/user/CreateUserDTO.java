package com.startupsdigidojo.demo.user;

@SuppressWarnings("unused")
public class CreateUserDTO {
    private String username;
    private String email;

    public CreateUserDTO(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public CreateUserDTO() {
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

    public User toUser() {
        return new User(username, email);
    }
}
