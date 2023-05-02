package com.example.semana_11.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PerguntaRequest {

    @NotEmpty
    private String titulo;

    @NotEmpty
    private String texto;

    @NotNull
    private Long quiz;
}
