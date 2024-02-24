package com.example.mochamoneys.controller;

import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.model.User;
import com.example.mochamoneys.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
