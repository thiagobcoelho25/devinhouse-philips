package com.example.semana_11.services;

import com.example.semana_11.models.Pergunta;
import com.example.semana_11.repositories.PerguntaRepository;
import com.example.semana_11.repositories.QuizRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerguntaService {

    private final PerguntaRepository perguntaRepository;
    private final QuizRepository quizRepository;

    public PerguntaService(PerguntaRepository perguntaRepository, QuizRepository quizRepository) {
        this.perguntaRepository = perguntaRepository;
        this.quizRepository = quizRepository;
    }

    public List<Pergunta> getAllPerguntas(){
        return perguntaRepository.findAll();
    }

    public Pergunta getPerguntaById(Long id){
        return perguntaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
