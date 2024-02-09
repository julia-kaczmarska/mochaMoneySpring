package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.model.User;
import com.example.mochamoneys.repository.BudgetRepository;
import com.example.mochamoneys.repository.ExpenseRepository;
import com.example.mochamoneys.repository.IncomeRepository;
import com.example.mochamoneys.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private static final int PAGE_SIZE = 3;
    private final BudgetRepository budgetRepository;
    //    private final ExpenseRepository expenseRepository;
//    private final IncomeRepository incomeRepository;
    private final UserRepository userRepository;

    public List<Budget> getBudgets(int page, Sort.Direction sort) {
        return budgetRepository.findAllBudgets(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")
                )
        );
    }

    public Budget getSingleBudget(long id) {
        return budgetRepository.findById(id)
                .orElseThrow();
    }

//    public List<Budget> getBudgetsWithData(int page, Sort.Direction sort) {
//        List<Budget> allBudgets = budgetRepository.findAllBudgets(PageRequest.of(page, PAGE_SIZE,
//                Sort.by(sort, "id")
//        ));
//        List<Long> ids = allBudgets.stream()
//                .map(Budget::getBudgetId)
//                .collect(Collectors.toList());
//        List<User> users = userRepository.findAllByBudgetIdIn(ids);
//        allBudgets.forEach(budget -> budget.setUser(extractUsers(users, budget.getBudgetId())));
//        return allBudgets;
//    }

//    private List<User> extractUsers(List<User> users, long id) {
//        return users.stream()
//                .filter(user -> user.getBudgetId() == id)
//                .collect(Collectors.toList());
//    }

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
