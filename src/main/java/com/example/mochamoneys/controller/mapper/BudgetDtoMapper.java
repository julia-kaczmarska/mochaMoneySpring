package com.example.mochamoneys.controller.mapper;

import com.example.mochamoneys.controller.dto.BudgetDto;
import com.example.mochamoneys.model.Budget;

import java.util.List;
import java.util.stream.Collectors;

public class BudgetDtoMapper {

    private BudgetDtoMapper() {
    }

    public static List<BudgetDto> mapToBudgetDtos(List<Budget> budgets) {
        return budgets.stream()
                .map(BudgetDtoMapper::mapToBudgetDto)
                .collect(Collectors.toList());
    }

    private static BudgetDto mapToBudgetDto(Budget budget) {
        return BudgetDto.builder()
                .id(budget.getId())
                .title(budget.getTitle())
                .build();
    }
}