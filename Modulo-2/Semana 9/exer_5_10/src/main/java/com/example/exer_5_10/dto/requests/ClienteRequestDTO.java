package com.example.exer_5_10.dto.requests;



import com.example.exer_5_10.models.Cliente;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class ClienteRequestDTO implements Serializable {

    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    private LocalDateTime dataNascimento;

    public Cliente clienteResquestDTOToCliente(){
        return new Cliente (null, this.nome, this.cpf, this.dataNascimento);
    }

}
