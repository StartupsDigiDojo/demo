package com.startupsdigidojo.demo.user;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserManagementService {
    private final Set<String> usernames = new HashSet<>();

    public String createUser(String username) {
        if (usernames.contains(username)) throw new IllegalArgumentException("Username "+ username +" already in use");

        usernames.add(username);

        return username;
    }
}
