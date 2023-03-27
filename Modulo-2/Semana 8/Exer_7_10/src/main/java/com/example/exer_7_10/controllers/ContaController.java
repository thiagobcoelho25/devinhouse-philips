package com.example.exer_7_10.controllers;

import com.example.exer_7_10.models.Cliente;
import com.example.exer_7_10.models.Conta;
import com.example.exer_7_10.services.ClienteService;
import com.example.exer_7_10.services.ContaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> findAll(){
        return ResponseEntity.ok().body(contaService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Conta> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(contaService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<Conta> insert(@Valid @RequestBody Conta conta_request){
        return ResponseEntity.ok().body(contaService.insert(conta_request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conta> update(@PathVariable Integer id, @Valid @RequestBody Conta conta){
        return ResponseEntity.ok().body(contaService.update(id, conta));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        contaService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
