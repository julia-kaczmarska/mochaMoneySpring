package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.repository.BudgetRepository;
import org.springframework.stereotype.Service;

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
