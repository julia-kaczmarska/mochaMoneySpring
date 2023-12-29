package com.controller;

import com.model.User;
import com.service.UserService;
import io.swagger.models.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }




}
