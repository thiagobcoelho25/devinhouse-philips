package com.example.exer_5_10.repositories;

import com.example.exer_5_10.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
