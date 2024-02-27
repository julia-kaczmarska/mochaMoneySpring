package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Budget;
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
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;

    //    private final ExpenseRepository expenseRepository;
    //    private final IncomeRepository incomeRepository;

    public Budget getBudgetByUserId(Long userId) {
        return budgetRepository.findBudgetByUserId(userId);
    }

    public Long getBudgetIdByUserId(Long userId){
        Budget budget = budgetRepository.findFirstByUserId(userId);
        return budget != null ? budget.getBudgetId() : null; // Zwraca budgetId lub null, jeśli nie znaleziono
    }

    public List<Object[]> findBudgetAndIncomeDetailsByUserId(Long userId){
        return budgetRepository.findBudgetAndIncomeDetailsByUserId(userId);
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

//    public List<Budget> getBudgetByUserId() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication instanceof UsernamePasswordAuthenticationToken) {
//            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//            Long userId = Long.parseLong(userDetails.getUsername());
//            return budgetRepository.findBudgetByUserId(userId, Pageable.ofSize(PAGE_SIZE));
//        }
//        return Collections.emptyList();
//    }

}
