package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancLancamentosRepository extends JpaRepository<LancamentosEntity, Long>, FinancLancamentosCustomRepository {
    // Outros métodos de consulta, se necessário
}
