package com.example.mochamoneys.controller;

import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/income")
public class IncomeController {
    @Autowired
    private final IncomeService incomeService;
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping("/{user_id}")
    public List<Income> getIncomes(@PathVariable Long user_id){
        return incomeService.getIncomes(user_id);
    }

//    @GetMapping("/{user_id}/{income_id}")
//    public Income getIncome(@PathVariable Long user_id, @PathVariable Long income_id){
//        return incomeService.getIncome(user_id,income_id);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Income createIncome(@RequestBody Income income){
        return incomeService.createIncome(income);
    }

    @PutMapping("/{user_id}/{income_id}")
    @ResponseStatus(HttpStatus.OK)
    public Income updateIncome(@PathVariable Long user_id, @PathVariable Long income_id, @RequestBody Income income){
        return incomeService.updateIncome(income);
    }

    @DeleteMapping("/{user_id}/{income_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteIncome(@PathVariable Long income_id){
        incomeService.deleteIncome(income_id);
    }
}
