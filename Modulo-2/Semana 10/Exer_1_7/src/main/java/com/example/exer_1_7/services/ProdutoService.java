package com.example.exer_1_7.services;

import com.example.exer_1_7.repositories.ProdutoRepository;
import com.example.exer_1_7.repositories.models.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto getFirstProduct(){
        return produtoRepository.findFirstById();
    }

    public Produto saveProduct(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> getAllProducts(Long id){
        return produtoRepository.findAllByUsuario(id);
    }

    public void deleteProduct(Long id){
        produtoRepository.deleteById(id);
    }

}
