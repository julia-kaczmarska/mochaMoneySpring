package com.example.mochamoneys.controller;

import com.example.mochamoneys.controller.dto.BudgetDto;
import com.example.mochamoneys.controller.mapper.BudgetDtoMapper;
import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BudgetController {

    private final BudgetService budgetService;

    @GetMapping("budgets")
    public List<BudgetDto> getBudget(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        return BudgetDtoMapper.mapToBudgetDtos(budgetService.getBudgets(pageNumber, sortDirection));
    }

    @GetMapping("/budgets/data")
    public List<Budget> getBudgetsWithData(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        return budgetService.getBudgetsWithData(pageNumber, sortDirection);
    }

    @GetMapping("/budgets/{id}")
    public Budget getSingleBudget(@PathVariable long id) {
        var budget = id != 0 ? id : 1;
        return budgetService.getSingleBudget(budget);
    }

    //NIE DZIAŁA POPRAWNIE - LUB NIE UMIEM UZYWAC
    @PostMapping("/budgets")
    public Budget addBudget(@RequestBody Budget budget) {
        return budgetService.addBudget(budget);
    }

    @PutMapping("/budgets")
    public Budget editBudget(@RequestBody Budget budget) {
        return budgetService.editBudget(budget);
    }

    @DeleteMapping("/budgets/{id}")
    public void deleteBudget(@PathVariable long id) {
        budgetService.deleteBudget(id);
    }
}

