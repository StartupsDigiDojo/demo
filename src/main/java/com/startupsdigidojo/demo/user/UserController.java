package com.startupsdigidojo.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("unused")
@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserManagementService userManagementService;

    @GetMapping("/{id}")
    public User readOneUser(@PathVariable("id") int id) {
        System.out.println(id);
        return userManagementService.readOne(id);
    }

    @PostMapping("/")
    public User createUser(@RequestBody CreateUserDTO userDTO) {
        return userManagementService.createUser(userDTO.toUser());
    }
}
