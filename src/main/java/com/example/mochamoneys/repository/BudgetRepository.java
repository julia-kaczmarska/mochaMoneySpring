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

    @Query("SELECT DISTINCT b FROM Budget b WHERE b.userId = :uid")
    Budget findBudgetByUserId(@Param("uid") Long userId);


    @Query("SELECT b.budgetId, b.userId, i.amount, i.date, ci.title, e.amount, e.date, ce.title FROM Budget b JOIN b.incomes i JOIN i.categoryinc ci JOIN b.expenses e JOIN e.categoryexp ce WHERE b.userId = :userId")
    List<Object[]> findBudgetDetailsByUserId(@Param("userId") Long userId);
    Budget findFirstByUserId(Long userId);
}
