package com.example.foxholeplanner.AuthService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.foxholeplanner.AuthService.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
