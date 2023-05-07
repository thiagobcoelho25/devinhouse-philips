package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaDePagamentoTest {

    private final FolhaDePagamento folha = new FolhaDePagamento();


    @Test
    @DisplayName("Quando nao informados gratificacao e funcao gerencial, deve retornar salario base")
    void calcularSalarioBruto_salarioBase() {
        Double salarioBase = 1000.0, gratificacao = null;
        String funcao = "analista";
        Double salarioBruto = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        assertNotNull(salarioBruto);
        assertEquals(salarioBase, salarioBruto);
    }

    @Test
    @DisplayName("Quando informada gratificacao, deve retornar salario acrescido do valor da gratificacao")
    void calcularSalarioBruto_gratificacao() {
        Double salarioBase = 1000.0, gratificacao = 250.0;
        String funcao = "analista";
        Double salarioBruto = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        assertTrue(salarioBase < salarioBruto);
        assertEquals(salarioBase + gratificacao, salarioBruto);
    }

    @Test
    @DisplayName("Quando informada funcao gerencial, deve retornar salario acrescido do percentual previsto")
    void calcularSalarioBruto_funcao() {
        Double salarioBase = 1000.0, gratificacao = null;
        String funcao = "gerente";
        Double salarioBruto = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        assertTrue(salarioBase < salarioBruto);
        assertEquals(salarioBase * 1.30, salarioBruto);
    }

    @Test
    @DisplayName("Quando informada funcao gerencial e gratificacao, deve retornar salario acrescido dos valores")
    void calcularSalarioBruto_tudo() {
        Double salarioBase = 1000.0, gratificacao = 200.0;
        String funcao = "gerente";
        Double salarioBruto = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        assertTrue(salarioBase < salarioBruto);
        assertEquals((salarioBase + gratificacao) * 1.30, salarioBruto);
    }

    @Test
    @DisplayName("Quando sem descontos, deve retornar o salario")
    void calcularSalarioLiquido_semDescontos() {
        Double salario = 1000.0;
        List<Double> descontos = new ArrayList<>();
        Double salarioLiquido = folha.calcularSalarioLiquido(salario, descontos);
        assertEquals(salario, salarioLiquido);
    }

    @Test
    @DisplayName("Quando contem descontos, deve retornar o salario reduzido dos descontos")
    void calcularSalarioLiquido_comDescontos() {
        // given
        Double salario = 1000.0;
        List<Double> descontos = List.of(250.0, 200.0);
        Double somaDeDescontos = descontos.stream().reduce(Double::sum).get();
        // when
        Double salarioLiquido = folha.calcularSalarioLiquido(salario, descontos);
        // then
        assertEquals(salario - somaDeDescontos, salarioLiquido);
    }

    @Test
    @DisplayName("Quando contem descontos que superam o valor do salario, deve lancar excecao")
    void calcularSalarioLiquido_salarioNegativo() {
        Double salario = 1000.0;
        List<Double> descontos = List.of(500.0, 200.0, 750.0);
        assertThrows(IllegalStateException.class, () ->
                folha.calcularSalarioLiquido(salario, descontos));
    }

}