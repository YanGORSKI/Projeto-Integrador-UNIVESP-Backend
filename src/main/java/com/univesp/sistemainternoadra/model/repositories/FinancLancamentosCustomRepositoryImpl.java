package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.FiltroRequest;
import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FinancLancamentosCustomRepositoryImpl implements FinancLancamentosCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<LancamentosEntity> findLancamentosByFilter(FiltroRequest req) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<LancamentosEntity> query = cb.createQuery(LancamentosEntity.class);
        Root<LancamentosEntity> root = query.from(LancamentosEntity.class);

        List<Predicate> predicates = new ArrayList<>();

        // Filtros dinâmicos
        if (req.getTipo() != null) {
            predicates.add(cb.equal(root.get("tipo"), req.getTipo()));
        }
        if (req.getDataInicio() != null && req.getDataFim() != null) {
            predicates.add(cb.between(root.get("data"), req.getDataInicio(), req.getDataFim()));
        }
        if (req.getConta() != null) {
            predicates.add(cb.equal(root.get("conta").get("idConta"), req.getConta()));
        }
        if (req.getCategoria() != null) {
            predicates.add(cb.equal(root.get("categoria").get("idCategoria"), req.getCategoria()));
        }
        if (req.getParcelas() != null) {
            predicates.add(cb.equal(root.get("parcelas"), req.getParcelas()));
        }
        if (req.getValor() != null) {
            predicates.add(cb.equal(root.get("valor"), req.getValor()));
        }
        if (req.getDescricao() != null && !req.getDescricao().isEmpty()) {
            predicates.add(cb.like(root.get("descricao"), "%" + req.getDescricao() + "%"));
        }

        query.where(predicates.toArray(new Predicate[0]));

        // Ordenação por Data, Tipo, Conta e Categoria
        query.orderBy(
                cb.asc(root.get("data")),
                cb.asc(root.get("tipo")),
                cb.asc(root.get("conta").get("descricao")), // Supondo que "nomeConta" seja o campo de ordenação em Conta
                cb.asc(root.get("categoria").get("descricao")) // Supondo que "nomeCategoria" seja o campo de ordenação em Categoria
        );

        System.out.println("findLancamentosByFilter: " + query.toString());

        return entityManager.createQuery(query).getResultList();
    }
}
