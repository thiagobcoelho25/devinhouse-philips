package com.example.exer_9_10.services;

import com.example.exer_9_10.models.Produto;
import com.example.exer_9_10.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getAllProducts(){
        return produtoRepository.findAll();
    }

}