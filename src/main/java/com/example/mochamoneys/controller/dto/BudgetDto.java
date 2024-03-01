package com.example.mochamoneys.controller.dto;

import com.example.mochamoneys.model.Expense;
import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.repository.ExpenseRepository;
import com.example.mochamoneys.repository.IncomeRepository;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class BudgetDto {
    private long budgetId;
    private long userId;
    private List<IncomeDto> incomes;
    private List<ExpenseDto> expenses;

}
