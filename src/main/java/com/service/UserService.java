package com.service;

import com.model.User;
import com.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}