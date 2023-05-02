package com.example.semana_11.controllers;

import com.example.semana_11.mappers.QuizMapper;
import com.example.semana_11.models.Quiz;
import com.example.semana_11.services.QuizService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    private final QuizMapper mapper;

    public QuizController(QuizService quizService, QuizMapper mapper) {
        this.quizService = quizService;
        this.mapper = mapper;
    }

//    @GetMapping
//    public ResponseEntity<List<Quiz>> getAllQuiz() {
//
//        return  ResponseEntity.ok(quizService.getAllQuiz());
//    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Quiz> getQuizById(@Valid @PathVariable(value = "id") Long id) {

        return  ResponseEntity.ok(quizService.getQuizById(id));
    }

    //    @GetMapping
//    public ResponseEntity<List<QuizResponse>> getAllQuiz() {
//        List<Quiz> quizzes = quizService.getAllQuiz();
//
//        return  ResponseEntity.ok(mapper.map(quizzes));
//    }

}
