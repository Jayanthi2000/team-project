package com.example.genchat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.genchat.model.User;
import com.example.genchat.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User u = service.login(user.getUsername(), user.getPassword());
        if (u != null) {
            return "Login Success";
        }
        return "Invalid Credentials";
    }
}