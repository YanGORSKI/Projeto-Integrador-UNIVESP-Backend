package com.univesp.sistemainternoadra.model.mappers;

import com.univesp.sistemainternoadra.controllers.financeiro.responses.LancamentosResponse;
import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import com.univesp.sistemainternoadra.model.DTO.financeiro.LancamentosDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LancamentosMapper {

    LancamentosDTO toDto(LancamentosEntity entity);

    // Adiciona o método para mapear diretamente LancamentosEntity para LancamentosResponse
    LancamentosResponse toResponse(LancamentosEntity entity);

    // Atualiza para usar o método toResponse para cada item da lista
    List<LancamentosResponse> toResponseList(List<LancamentosEntity> entities);
}
