package com.controller;

import com.model.Income;
import com.service.IncomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class IncomeController {
    private final IncomeService incomeService;
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping("/income/{user_id}")
    public List<Income> getIncomes(@PathVariable Long user_id){
        return incomeService.getIncomes(user_id);
    }

    @GetMapping("/income/{user_id}/{income_id}")
    public Income getIncome(@PathVariable Long user_id, Long income_id){
        return incomeService.getIncome(user_id,income_id);
    }

    @PostMapping("/income")
    public Income createIncome(@RequestBody Income income){
        return incomeService.createIncome(income);
    }

    @PutMapping("/income/{user_id}/{income_id}")
    public Income updateIncome(@PathVariable Long user_id, Long income_id, @RequestBody Income income){
        return incomeService.updateIncome(income);
    }
}
