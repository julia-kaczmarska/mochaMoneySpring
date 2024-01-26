package com.example.mochamoneys.controller.mapper;

import com.example.mochamoneys.controller.dto.BudgetDto;
import com.example.mochamoneys.controller.dto.UserDto;
import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDtoMapper {

    private UserDtoMapper() {
    }

    public static List<UserDto> mapToUserDtos(List<User> users) {
        return users.stream()
                .map(UserDtoMapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    private static UserDto mapToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .budgetId(user.getBudgetId())
                .build();
    }
}