package com.univesp.sistemainternoadra.controllers.financeiro;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.LancamentosRequest;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.LancamentosResponse;
import com.univesp.sistemainternoadra.services.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroController {

    @Autowired
    private FinanceiroService financeiroService;

    @GetMapping("/lancamentos")
    public List<LancamentosResponse> getLancamentos(@RequestParam(required = false) String tipo,
                                                    @RequestParam(required = false) String dataInicio,
                                                    @RequestParam(required = false) String dataFim,
                                                    @RequestParam(required = false) String conta,
                                                    @RequestParam(required = false) String categoria,
                                                    @RequestParam(required = false) String parcelas,
                                                    @RequestParam(required = false) String valor,
                                                    @RequestParam(required = false) String descricao,
                                                    @RequestParam(defaultValue = "20") int exibirPorPagina) {
        LancamentosRequest lancamentosRequest = new LancamentosRequest(tipo, dataInicio, dataFim, conta, categoria, parcelas, valor, descricao, exibirPorPagina);
        System.out.println("DEBUG lancamentosRequest: " + lancamentosRequest);
        return financeiroService.buscarLancamentosPorFiltroPaginado(lancamentosRequest);
    }
}
