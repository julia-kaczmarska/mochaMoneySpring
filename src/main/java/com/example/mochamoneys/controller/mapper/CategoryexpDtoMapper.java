package com.example.mochamoneys.controller.mapper;

import com.example.mochamoneys.controller.dto.BudgetDto;
import com.example.mochamoneys.controller.dto.CategoryexpDto;
import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.model.Categoryexp;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryexpDtoMapper {

    private CategoryexpDtoMapper() {
    }

    public static List<CategoryexpDto> mapToCategoryexpDtos(List<Categoryexp> categoryexps) {
        return categoryexps.stream()
                .map(CategoryexpDtoMapper::mapToCategoryexpDto)
                .collect(Collectors.toList());
    }

    private static CategoryexpDto mapToCategoryexpDto(Categoryexp categoryexp) {
        return CategoryexpDto.builder()
                .id(categoryexp.getId())
                .title(categoryexp.getTitle())
                .userId(categoryexp.getUserId())
                .build();
    }
}