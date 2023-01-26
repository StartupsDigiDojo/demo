package com.startupsdigidojo.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
