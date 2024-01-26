package com.example.mochamoneys.controller.mapper;

import com.example.mochamoneys.controller.dto.CategoryexpDto;
import com.example.mochamoneys.controller.dto.CategoryincDto;
import com.example.mochamoneys.model.Categoryexp;
import com.example.mochamoneys.model.Categoryinc;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryincDtoMapper {

    private CategoryincDtoMapper() {
    }

    public static List<CategoryincDto> mapToCategoryincDtos(List<Categoryinc> categoryincs) {
        return categoryincs.stream()
                .map(CategoryincDtoMapper::mapToCategoryincDto)
                .collect(Collectors.toList());
    }

    private static CategoryincDto mapToCategoryincDto(Categoryinc categoryinc) {
        return CategoryincDto.builder()
                .id(categoryinc.getId())
                .title(categoryinc.getTitle())
                .userId(categoryinc.getUserId())
                .build();
    }
}