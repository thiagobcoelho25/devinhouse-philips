package com.example.semana_11.mappers;

import com.example.semana_11.dtos.PerguntaRequest;
import com.example.semana_11.models.Pergunta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PerguntaMapper {

    PerguntaMapper INSTANCE = Mappers.getMapper(PerguntaMapper.class);

    @Mapping(target = "quiz",ignore = true)
    Pergunta resToPergunta(PerguntaRequest perguntaRequest);
}
