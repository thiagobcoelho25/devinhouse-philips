package com.example.semana_11.controllers;

import com.example.semana_11.models.Pergunta;
import com.example.semana_11.services.PerguntaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

    private final PerguntaService perguntaService;

    public PerguntaController(PerguntaService perguntaService) {
        this.perguntaService = perguntaService;
    }

    @GetMapping
    public ResponseEntity<List<Pergunta>> getAllPerguntas() {

        return  ResponseEntity.ok(perguntaService.getAllPerguntas());
    }
}
