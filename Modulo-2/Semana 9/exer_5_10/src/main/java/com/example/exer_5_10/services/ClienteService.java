package com.example.exer_5_10.services;

import com.example.exer_5_10.models.Cliente;
import com.example.exer_5_10.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente create(Cliente cliente){
        cliente.setId(null);
        return clienteRepository.save(cliente);
    }

}
