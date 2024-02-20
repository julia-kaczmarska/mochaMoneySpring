package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Expense;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface
ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT DISTINCT e FROM Expense e")
    List<Expense> findAllExpenses(Pageable page);
}