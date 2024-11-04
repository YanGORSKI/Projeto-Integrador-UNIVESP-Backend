package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.LancamentosRequest;
import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinanceiroLancamentosRepository extends JpaRepository<LancamentosEntity, Long> {

    @Query("SELECT l FROM LancamentosEntity l " +
            "WHERE (l.tipo IS NULL OR l.tipo = :#{#req.tipo}) " +
            "AND (l.data >= :#{#req.dataInicio} OR l.data <= :#{#req.dataFim}) " +
            "AND (l.conta.idConta IS NULL OR l.conta.idConta = :#{#req.conta}) " +
            "AND (l.categoria.idCategoria IS NULL OR l.categoria.idCategoria = :#{#req.categoria}) " +
            "AND (l.parcelas IS NULL OR l.parcelas = :#{#req.parcelas}) " +
            "AND (l.valor IS NULL OR l.valor = :#{#req.valor}) " +
            "AND (l.descricao IS NULL OR l.descricao LIKE CONCAT('%', :#{#req.descricao}, '%'))")
    List<LancamentosEntity> findLancamentosByFilter(@Param("req") LancamentosRequest lancamentosRequest);
}
