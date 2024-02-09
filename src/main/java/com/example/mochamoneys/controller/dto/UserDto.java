package com.example.mochamoneys.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {
    private long userId;
    private String name;
    private String email;
    private String password;
    private long budgetId;
}
