package com.example.exer_5_10.dto.responses;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ClienteResponseDTO implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDateTime dataNascimento;
}
