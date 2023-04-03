package com.example.exer_5_10.controllers;

import com.example.exer_5_10.dto.requests.ClienteRequestDTO;
import com.example.exer_5_10.models.Cliente;
import com.example.exer_5_10.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        return ResponseEntity.ok().body(clienteService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Cliente> insert(@Valid @RequestBody ClienteRequestDTO cliente_request){
        return ResponseEntity.ok().body(clienteService.create(cliente_request.clienteResquestDTOToCliente()));
    }


}

