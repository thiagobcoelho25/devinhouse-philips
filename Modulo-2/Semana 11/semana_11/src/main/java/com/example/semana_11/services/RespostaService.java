package com.example.semana_11.services;

import com.example.semana_11.models.Pergunta;
import com.example.semana_11.models.Resposta;
import com.example.semana_11.repositories.RespostaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespostaService {

    private final RespostaRepository respostaRepository;

    public RespostaService(RespostaRepository respostaRepository) {
        this.respostaRepository = respostaRepository;
    }

    public List<Resposta> getAllResposta(){
        return respostaRepository.findAll();
    }

    public Resposta getRespostaById(Long id){
        return respostaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
