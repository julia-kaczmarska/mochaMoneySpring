package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryexpDto {
    private long categoryexpId;
    private String title;
    private long userId;
}
