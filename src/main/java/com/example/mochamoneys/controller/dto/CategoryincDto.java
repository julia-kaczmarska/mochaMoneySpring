package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryincDto {
    private long id;
    private String title;
    private long userId;
}
