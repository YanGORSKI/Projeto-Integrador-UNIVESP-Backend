package com.univesp.sistemainternoadra.model.mappers;

import com.univesp.sistemainternoadra.model.DAO.financeiro.ContaEntity;
import com.univesp.sistemainternoadra.model.DTO.financeiro.ContaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContaMapper {
    ContaDTO toDto(ContaEntity contaEntity);
    ContaEntity toEntity(ContaDTO contaDTO);
}
