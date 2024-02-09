package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class IncomeDto {
    private Double amount;
    private LocalDate date;
    private Long categoryIncId;
    private Long budgetId;
}

