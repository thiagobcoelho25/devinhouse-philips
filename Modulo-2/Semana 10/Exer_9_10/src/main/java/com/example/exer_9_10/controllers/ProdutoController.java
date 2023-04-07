package com.example.exer_9_10.controllers;

import com.example.exer_9_10.models.Produto;
import com.example.exer_9_10.services.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping(path = "all")
    public ResponseEntity<List<Produto>> produtoGetAll(){

        List<Produto> produtos = produtoService.getAllProducts();

        return ResponseEntity.ok(produtos);
    }

}
