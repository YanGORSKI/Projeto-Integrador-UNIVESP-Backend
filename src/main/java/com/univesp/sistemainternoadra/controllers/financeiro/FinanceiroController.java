package com.univesp.sistemainternoadra.controllers.financeiro;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.FiltroRequest;
import com.univesp.sistemainternoadra.controllers.financeiro.requests.LancamentosRequest;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.DemonstrativoResponse;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.LancamentosResponse;
import com.univesp.sistemainternoadra.model.DAO.financeiro.CategoriaEntity;
import com.univesp.sistemainternoadra.model.DAO.financeiro.ContaEntity;
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
        FiltroRequest filtroRequest = new FiltroRequest(tipo, dataInicio, dataFim, conta, categoria, parcelas, valor, descricao, exibirPorPagina);
        System.out.println("DEBUG GET '/financeiro/lancamentos' request: " + filtroRequest);
        final var response = financeiroService.buscarLancamentosPorFiltroPaginado(filtroRequest);
        System.out.println("DEBUG GET '/financeiro/lancamentos' response: ");
        response.forEach(System.out::println);
        return response;
    }

    @PostMapping("/lancamentos")
    public LancamentosResponse createLancamento(@RequestBody LancamentosRequest lancamentosRequest) {
        System.out.println("DEBUG POST '/financeiro/lancamentos' request: " + lancamentosRequest);
        LancamentosResponse response = financeiroService.criarLancamento(lancamentosRequest);
        System.out.println("DEBUG POST '/financeiro/lancamentos' response: " + response);
        return response;
    }

    @DeleteMapping("/lancamentos/{id}")
    public void deleteLancamento(@PathVariable Long id) {
        System.out.println("DEBUG DELETE '/financeiro/lancamentos/" + id + "'");
        financeiroService.deletarLancamentoPorId(id);
        System.out.println("DEBUG DELETE '/financeiro/lancamentos/" + id + "' sucesso");
    }

    @GetMapping("/demonstrativo")
    public DemonstrativoResponse getDemonstrativo(@RequestParam int mes,
                                                  @RequestParam int ano) {
        System.out.println("DEBUG GET '/financeiro/demonstrativo?mes=" + mes + "&ano=" + ano);
        DemonstrativoResponse response = financeiroService.calcularDemonstrativo(mes, ano);
        System.out.println("DEBUG GET '/financeiro/demonstrativo' response: " + response);
        return response;
    }

    @GetMapping("/categorias")
    public List<CategoriaEntity> getAllCategorias() {
        System.out.println("DEBUG GET '/financeiro/categorias'");
        final var response = financeiroService.getAllCategorias();
        System.out.println("DEBUG GET '/financeiro/categorias' response: ");
        response.forEach(System.out::println);
        return response;
    }

    @GetMapping("/contas")
    public List<ContaEntity> getAllContas() {
        System.out.println("DEBUG GET '/financeiro/categorias'");
        final var response = financeiroService.getAllContas();
        System.out.println("DEBUG GET '/financeiro/categorias' response: ");
        response.forEach(System.out::println);
        return response;
    }
}
