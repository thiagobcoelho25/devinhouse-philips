package com.example.exer_5_10.services;

import com.example.exer_5_10.models.Categoria;
import com.example.exer_5_10.models.Cliente;
import com.example.exer_5_10.models.Produto;
import com.example.exer_5_10.models.ProdutoCliente;
import com.example.exer_5_10.repositories.CategoriaRepository;
import com.example.exer_5_10.repositories.ClienteRepository;
import com.example.exer_5_10.repositories.ProdutoClienteRepository;
import com.example.exer_5_10.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ParseException;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
public class DBService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ProdutoClienteRepository produtoClienteRepository;

    @Bean
    public boolean instantiateDatabase() throws ParseException {
        Categoria cat_1 = new Categoria(null,"Limpeza");
        Categoria cat_2 = new Categoria(null,"Banho");
        Categoria cat_3 = new Categoria(null,"Comida");

        categoriaRepository.saveAll(Arrays.asList(cat_1, cat_2, cat_3));

        Cliente cliente_1 = new Cliente(null, "Thiago" ,"12345679", LocalDateTime.of(2023, 4, 3, 14, 0, 0));
        Cliente cliente_2 = new Cliente(null, "Guto" ,"99999999", LocalDateTime.of(2023, 4, 3, 14, 0, 0));
        Cliente cliente_3 = new Cliente(null, "Maria Clara" ,"97654321", LocalDateTime.of(2023, 4, 3, 14, 0, 0));

        clienteRepository.saveAll(Arrays.asList(cliente_1, cliente_2, cliente_3));

        Produto prod_1 = new Produto(null, "Pinho Sol", "Desifentante", 8.0, cat_1);
        Produto prod_2 = new Produto(null, "shampoo Dove", "shampoo cabelos lisos", 12.0, cat_2);
        Produto prod_3 = new Produto(null, "Nuggets", "Frango Empanado Sadia", 15.0, cat_3);
        Produto prod_4 = new Produto(null, "Colgate", "pasta de dente", 12.0, cat_2);

        produtoRepository.saveAll(Arrays.asList(prod_1, prod_2,prod_3,prod_4));

        ProdutoCliente prod_cli_1 = new ProdutoCliente(prod_1, cliente_1);
        ProdutoCliente prod_cli_2 = new ProdutoCliente(prod_1, cliente_2);
        ProdutoCliente prod_cli_3 = new ProdutoCliente(prod_2, cliente_3);
        ProdutoCliente prod_cli_4 = new ProdutoCliente(prod_4, cliente_3);

        produtoClienteRepository.saveAll(Arrays.asList(prod_cli_1, prod_cli_2, prod_cli_3, prod_cli_4));

        return true;
    }


}

