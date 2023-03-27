package com.example.exer_7_10.controllers.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
public class ValidationStandardError implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private Integer status;
    private String error;
    private String path;

    private List<Campo> campos;

    @AllArgsConstructor
    @Getter
    public static class Campo{

        private String nome;
        private String mensagem;

    }
}
