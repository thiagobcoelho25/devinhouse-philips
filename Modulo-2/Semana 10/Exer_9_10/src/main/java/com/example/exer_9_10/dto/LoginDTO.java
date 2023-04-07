package com.example.exer_9_10.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginDTO {
    @NotBlank
    private String login;
    @NotBlank
    private String senha;

}
