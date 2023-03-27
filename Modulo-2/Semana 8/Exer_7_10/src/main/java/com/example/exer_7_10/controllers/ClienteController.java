package com.example.exer_7_10.controllers;

import com.example.exer_7_10.exceptions.DataIntegrityException;
import com.example.exer_7_10.models.Cliente;
import com.example.exer_7_10.services.ClienteService;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(clienteService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<Cliente> insert(@Valid @RequestBody Cliente cliente_request){
        return ResponseEntity.ok().body(clienteService.insert(cliente_request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Integer id, @Valid @RequestBody Cliente cliente){
        return ResponseEntity.ok().body(clienteService.update(id, cliente));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
