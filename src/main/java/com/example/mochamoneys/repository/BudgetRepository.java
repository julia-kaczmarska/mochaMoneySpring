package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Budget;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
    String userId = userDetails.getUsername(); // Przykładowe uzyskanie user_id
    @Query("SELECT DISTINCT b FROM Budget b WHERE b.userId = :uid")
    List<Budget> findBudgetByUserId(@Param("uid") Long userId, Pageable page);
}
