package com.example.exer_5_10.repositories;

import com.example.exer_5_10.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
