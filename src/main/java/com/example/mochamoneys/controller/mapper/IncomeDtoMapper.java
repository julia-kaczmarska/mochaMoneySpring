package com.example.mochamoneys.controller.mapper;

import com.example.mochamoneys.controller.dto.IncomeDto;
import com.example.mochamoneys.model.Income;

import java.util.List;
import java.util.stream.Collectors;

public class IncomeDtoMapper {
    private IncomeDtoMapper() {
    }

    public static List<IncomeDto> mapToIncomeDtos(List<Income> incomes) {
        return incomes.stream()
                .map(IncomeDtoMapper::mapToIncomeDto)
                .collect(Collectors.toList());
    }

    private static IncomeDto mapToIncomeDto(Income income) {
        return IncomeDto.builder()
                .budgetId(income.getIncomeId())
                .build();
    }


}
