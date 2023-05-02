package com.example.semana_11.services;

import com.example.semana_11.models.Quiz;
import com.example.semana_11.repositories.QuizRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<Quiz> getAllQuiz(){
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id){
        return quizRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

}
