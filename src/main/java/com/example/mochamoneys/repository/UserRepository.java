package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("SELECT DISTINCT u FROM User u")
//    List<User> findAllUsers(Pageable page);

    User findByEmail(String email);

//    User findByUsername(String username);
}
