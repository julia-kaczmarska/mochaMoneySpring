package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}