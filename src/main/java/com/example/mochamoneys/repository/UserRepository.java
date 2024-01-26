package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByBudgetIdIn(List<Long> ids);
    @Query("SELECT DISTINCT u FROM User u")
    List<User> findAllUsers(Pageable page);

    List<User> findByEmailIn(List<String> emails);
}
