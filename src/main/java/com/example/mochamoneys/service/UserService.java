package com.example.mochamoneys.service;

import com.example.mochamoneys.model.User;
import com.example.mochamoneys.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getSingleUser(long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
