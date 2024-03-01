package com.example.mochamoneys.controller.dto;

import com.example.mochamoneys.model.Categoryinc;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class IncomeDto {
    private Long incomeId;
    private Double amount;
    private LocalDate date;
//    private Long categoryIncId;
    private Long budgetId;
    private CategoryincDto categoryinc;

}

