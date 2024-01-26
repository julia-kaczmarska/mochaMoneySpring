package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Budget;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    @Query("SELECT DISTINCT b FROM Budget b")
    List<Budget> findAllBudgets(Pageable page);
}