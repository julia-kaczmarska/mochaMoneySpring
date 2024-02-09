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

    @GetMapping("login/{id}")
    public User getSingleUser(@PathVariable long id) {
        var user = id != 0 ? id : 1;
        return userService.getSingleUser(user);
    }

    @PostMapping("/signin")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

}
