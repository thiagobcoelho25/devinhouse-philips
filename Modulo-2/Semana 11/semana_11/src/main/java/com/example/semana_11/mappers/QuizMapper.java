package com.example.semana_11.mappers;

import com.example.semana_11.dtos.QuizRequest;
import com.example.semana_11.models.Quiz;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface QuizMapper {

    QuizMapper INSTANCE = Mappers.getMapper(QuizMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "perguntas", ignore = true)
    Quiz reqToQuiz(QuizRequest quizRequest);

}
