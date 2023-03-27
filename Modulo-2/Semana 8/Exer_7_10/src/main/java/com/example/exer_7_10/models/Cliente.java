package com.example.exer_7_10.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;

@Entity
@EqualsAndHashCode(of = {"id"})
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @NotBlank
    private String nome;

    @CPF(message = "CPF NÃO VALIDO!")
    @NonNull
    @NotBlank(message = "CPF NÃO PODE SER VAZIO")
    private String cpf;
}
