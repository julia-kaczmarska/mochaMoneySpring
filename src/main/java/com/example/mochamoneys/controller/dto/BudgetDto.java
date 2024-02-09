package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class BudgetDto {
    private long budgetId;
    private long userId;
    private List<IncomeDto> incomes;

    public List<IncomeDto> getIncomesForBudget(Long budgetId) {
        return incomes.stream()
                .filter(incomeDto -> incomeDto.getBudgetId().equals(budgetId))
                .collect(Collectors.toList());
    }

    public void setIncomes(List<IncomeDto> incomes) {
        this.incomes = incomes;
    }
}
