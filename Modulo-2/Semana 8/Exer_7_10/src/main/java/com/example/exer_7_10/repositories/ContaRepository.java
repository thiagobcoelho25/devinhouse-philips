package com.example.exer_7_10.repositories;

import com.example.exer_7_10.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
