package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BudgetDto {
    private long id;
    private String title;
}
