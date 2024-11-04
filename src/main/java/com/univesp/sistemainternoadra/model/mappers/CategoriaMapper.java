package com.univesp.sistemainternoadra.model.mappers;

import com.univesp.sistemainternoadra.model.DAO.financeiro.CategoriaEntity;
import com.univesp.sistemainternoadra.model.DTO.financeiro.CategoriaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    CategoriaDTO toDto(CategoriaEntity categoriaEntity);
    CategoriaEntity toEntity(CategoriaDTO categoriaDTO);
}
