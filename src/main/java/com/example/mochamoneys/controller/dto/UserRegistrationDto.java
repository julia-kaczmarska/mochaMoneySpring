package com.example.mochamoneys.controller.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class UserRegistrationDto {
    private String name;
    private String email;
    private String password;


}
