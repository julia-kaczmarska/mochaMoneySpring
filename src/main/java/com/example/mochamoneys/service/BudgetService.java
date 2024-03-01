package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.model.Expense;
import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.model.User;
import com.example.mochamoneys.repository.BudgetRepository;
import com.example.mochamoneys.repository.ExpenseRepository;
import com.example.mochamoneys.repository.IncomeRepository;
import com.example.mochamoneys.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;

        private final ExpenseRepository expenseRepository;
        private final IncomeRepository incomeRepository;

    public Budget getBudgetByUserId(Long userId) {
        return budgetRepository.findBudgetByUserId(userId);
    }

    public Long getBudgetIdByUserId(Long userId){
        Budget budget = budgetRepository.findFirstByUserId(userId);
        return budget != null ? budget.getBudgetId() : null; // Zwraca budgetId lub null, jeśli nie znaleziono
    }

    public List<Income> getIncomeByBudgetIdAndDate(Long id, LocalDate dateFrom, LocalDate dateTo) {
        return incomeRepository.findAllByBudgetIdAndDateBetween(id, dateFrom, dateTo);
    }

    public List<Expense> getExpenseByBudgetIdAndDate(Long id, LocalDate dateFrom, LocalDate dateTo) {
        return expenseRepository.findAllByBudgetIdAndDateBetween(id, dateFrom, dateTo);
    }

    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    @Transactional
    public Budget editBudget(Budget budget) {
        Budget budgetEdited = budgetRepository.findById(budget.getBudgetId()).orElseThrow();
        return budgetEdited;
    }

    public void deleteBudget(long id) {
        budgetRepository.deleteById(id);
    }

}
