package com.example.exer_1_7.repositories;

import com.example.exer_1_7.repositories.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    @Query(value = "SELECT * FROM produto LIMIT 1",  nativeQuery = true)
    Produto findFirstById();

    @Query(value = "SELECT * FROM produto WHERE usuario_id = :id", nativeQuery = true)
    List<Produto> findAllByUsuario(@Param("id") Long usuario_id);
}
