package com.univesp.sistemainternoadra.services;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.LancamentosRequest;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.LancamentosResponse;
import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import com.univesp.sistemainternoadra.model.mappers.LancamentosMapper;
import com.univesp.sistemainternoadra.model.repositories.FinanceiroLancamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroLancamentosRepository financeiroLancamentosRepository;

    @Autowired
    private LancamentosMapper lancamentosMapper;

    public List<LancamentosResponse> buscarLancamentosPorFiltroPaginado(LancamentosRequest lancamentosRequest) {
        System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 01");
        // Verifica se dataInicio e dataFim são nulos
        if (lancamentosRequest.getDataInicio() == null && lancamentosRequest.getDataFim() == null) {
            System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 02");
            // Define a data de início como o primeiro dia do mês atual
            LocalDate hoje = LocalDate.now();
            LocalDate primeiroDiaDoMes = hoje.withDayOfMonth(1);

            System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 03");

            // Atualiza o objeto de requisição
            lancamentosRequest.setDataInicio(primeiroDiaDoMes);
            lancamentosRequest.setDataFim(hoje);

            System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 04");
        }
        System.out.println("DEBUG FinanceiroService lancamentosRequest: " + lancamentosRequest);
        List<LancamentosEntity> lancamentosEntities = financeiroLancamentosRepository.findLancamentosByFilter(lancamentosRequest);
        System.out.println("DEBUG buscarLancamentosPorFiltroPaginado lancamentosEntities: " + lancamentosEntities);
        return lancamentosMapper.toResponseList(lancamentosEntities);
    }
}
