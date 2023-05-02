package com.example.semana_11.config;

import com.example.semana_11.models.Pergunta;
import com.example.semana_11.models.Quiz;
import com.example.semana_11.models.Resposta;
import com.example.semana_11.repositories.PerguntaRepository;
import com.example.semana_11.repositories.QuizRepository;
import com.example.semana_11.repositories.RespostaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ParseException;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class DBService {

    private final QuizRepository quizRepository;

    private final PerguntaRepository perguntaRepository;

    private final RespostaRepository respostaRepository;

    public DBService(QuizRepository quizRepository, PerguntaRepository perguntaRepository, RespostaRepository respostaRepository) {
        this.quizRepository = quizRepository;
        this.perguntaRepository = perguntaRepository;
        this.respostaRepository = respostaRepository;
    }

    @Bean
    public boolean instantiateDatabase() throws ParseException {
        /*
        Caso de Entidades Bidirecionais
        http://blog.triadworks.com.br/jpa-por-que-voce-deveria-evitar-relacionamento-bidirecional
        https://thorben-janssen.com/best-practices-many-one-one-many-associations-mappings/#Don8217t_use_unidirectional_one-to-many_associations
        https://thorben-janssen.com/ultimate-guide-association-mappings-jpa-hibernate/#Bidirectional_Many-to-One_Associations
        */

        Quiz quiz_1 = new Quiz(null, "Quiz 1", "Quiz sobre o tema 1");

        Pergunta pergunta_1 = new Pergunta(null, "pergunta 1", "Lorem Ipsum Dolor", quiz_1, null);

        pergunta_1.setQuiz(quiz_1);

        quiz_1.setPerguntas(Collections.singletonList(pergunta_1));

        Resposta resposta_1 = new Resposta(null, "Texto resposta 1", pergunta_1);



        quizRepository.save(quiz_1);
        respostaRepository.save(resposta_1);



        return true;
    }

}
