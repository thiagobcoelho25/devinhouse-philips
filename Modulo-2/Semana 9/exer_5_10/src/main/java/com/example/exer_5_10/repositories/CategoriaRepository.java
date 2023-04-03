package com.example.exer_5_10.repositories;

import com.example.exer_5_10.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
