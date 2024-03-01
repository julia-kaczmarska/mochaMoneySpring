package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Expense;
import com.example.mochamoneys.model.Income;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface
ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findAllByBudgetIdAndDateBetween(Long budgetId, LocalDate dateFrom, LocalDate dateTo);

}