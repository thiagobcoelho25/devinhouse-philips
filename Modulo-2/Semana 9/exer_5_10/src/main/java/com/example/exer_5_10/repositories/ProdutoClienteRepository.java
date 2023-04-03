package com.example.exer_5_10.repositories;

import com.example.exer_5_10.models.PKs.ProdutoClientePK;
import com.example.exer_5_10.models.ProdutoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoClienteRepository extends JpaRepository<ProdutoCliente, ProdutoClientePK> {
}
