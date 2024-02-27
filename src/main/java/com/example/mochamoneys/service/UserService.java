package com.example.mochamoneys.service;

import com.example.mochamoneys.controller.dto.UserRegistrationDto;
import com.example.mochamoneys.model.User;
import com.example.mochamoneys.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public abstract class UserService implements UserDetailsService {
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private final UserRepository userRepository;


    public abstract User save(UserRegistrationDto registrationDto);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }


//    public User getSingleUser(long id) {
//        return userRepository.findById(id)
//                .orElseThrow();
//    }
//
//    public User addUser(User user) {
//        return userRepository.save(user);
//    }
}
