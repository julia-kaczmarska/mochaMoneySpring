package com.service;

import com.model.Budget;
import com.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

//    public List<Budget> getBudgets(){
//        return budgetRepository.findAll();
//    }

    public Budget getBudget(Long budgetId){
        return budgetRepository.findById(budgetId).orElseThrow();
    }

}
