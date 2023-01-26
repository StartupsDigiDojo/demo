package com.startupsdigidojo.demo.user;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserManagementService {
    private final Set<User> users = new HashSet<>();

    public User createUser(User user) {
        String username = user.getUsername();
        if (users.contains(user)) throw new IllegalArgumentException("Username "+ username +" already in use");

        user.setId(users.size() + 1);

        users.add(user);

        return user;
    }
}
