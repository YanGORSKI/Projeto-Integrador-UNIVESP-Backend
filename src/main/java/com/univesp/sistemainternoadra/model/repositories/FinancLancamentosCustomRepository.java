package com.univesp.sistemainternoadra.model.repositories;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.FiltroRequest;
import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;

import java.util.List;

public interface FinancLancamentosCustomRepository {
    List<LancamentosEntity> findLancamentosByFilter(FiltroRequest filtroRequest);
}
