package com.example.exer_7_10.services;

import com.example.exer_7_10.models.Cliente;
import com.example.exer_7_10.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ParseException;

import java.util.Arrays;

@Configuration
public class DBService {

    @Autowired
    ClienteRepository clienteRepository;

    @Bean
    public boolean instantiateDatabase() throws ParseException {
        Cliente cliente_1 = new Cliente(null,"Thiago", "83570123022");
        Cliente cliente_2 = new Cliente(null,"GUTO", "36530962000");
        Cliente cliente_3 = new Cliente(null,"Maria", "01386107034");

        clienteRepository.saveAll(Arrays.asList(cliente_1, cliente_2, cliente_3));
        return true;
    }

}
