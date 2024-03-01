package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class ExpenseDto {
    private Long expenseId;
    private Double amount;
    private LocalDate date;
    private Long categoryExpId;
    private Long budgetId;
    private CategoryexpDto categoryexp;
}
