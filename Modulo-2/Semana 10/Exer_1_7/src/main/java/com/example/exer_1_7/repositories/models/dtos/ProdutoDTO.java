package com.example.exer_1_7.repositories.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data_lancamento;
    @DecimalMin(value = "0.1", message = "Valor deve ser maior que 0.1")
    private Double preco;
}
