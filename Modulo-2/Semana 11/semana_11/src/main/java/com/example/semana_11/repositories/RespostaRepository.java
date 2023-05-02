package com.example.semana_11.repositories;

import com.example.semana_11.models.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Long> {

    List<Resposta> findByPerguntaId(Long id);
}
