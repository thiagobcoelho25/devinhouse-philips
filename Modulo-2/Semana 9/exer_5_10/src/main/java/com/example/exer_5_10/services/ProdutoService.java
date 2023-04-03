package com.example.exer_5_10.services;

import com.example.exer_5_10.models.Produto;
import com.example.exer_5_10.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto create(Produto produto){
        produto.setId(null);
        return produtoRepository.save(produto);
    }
}
