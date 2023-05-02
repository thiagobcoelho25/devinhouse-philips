package com.example.semana_11.mappers;

import com.example.semana_11.dtos.RespostaRequest;
import com.example.semana_11.models.Resposta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface RespostaMapper {

    RespostaMapper INSTANCE = Mappers.getMapper(RespostaMapper.class);

    Resposta reqToResposta(RespostaRequest respostaRequest);
}