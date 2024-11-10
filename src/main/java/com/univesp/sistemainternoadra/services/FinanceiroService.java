package com.univesp.sistemainternoadra.services;

import com.univesp.sistemainternoadra.controllers.financeiro.requests.FiltroRequest;
import com.univesp.sistemainternoadra.controllers.financeiro.requests.LancamentosRequest;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.DemonstrativoLancamentoResponse;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.DemonstrativoResponse;
import com.univesp.sistemainternoadra.controllers.financeiro.responses.LancamentosResponse;
import com.univesp.sistemainternoadra.model.DAO.financeiro.CategoriaEntity;
import com.univesp.sistemainternoadra.model.DAO.financeiro.ContaEntity;
import com.univesp.sistemainternoadra.model.DAO.financeiro.LancamentosEntity;
import com.univesp.sistemainternoadra.model.mappers.LancamentosMapper;
import com.univesp.sistemainternoadra.model.repositories.FinancCategoriaRepository;
import com.univesp.sistemainternoadra.model.repositories.FinancContaRepository;
import com.univesp.sistemainternoadra.model.repositories.FinancLancamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FinanceiroService {

    @Autowired
    private FinancLancamentosRepository financLancamentosRepository;
    @Autowired
    private LancamentosMapper lancamentosMapper;
    @Autowired
    private FinancCategoriaRepository categoriaRepository;
    @Autowired
    private FinancContaRepository contaRepository;

    public LancamentosResponse criarLancamento(LancamentosRequest lancamentosRequest) {
        LancamentosEntity lancamento = new LancamentosEntity();

        lancamento.setTipo(lancamentosRequest.getTipo());
        lancamento.setData(lancamentosRequest.getData());
        lancamento.setValor(lancamentosRequest.getValor());
        lancamento.setParcelas(lancamentosRequest.getParcelas());
        lancamento.setDescricao(lancamentosRequest.getDescricao());

        // Carregar entidades de Conta e Categoria pelo ID fornecido
        contaRepository.findById(lancamentosRequest.getContaId()).ifPresent(lancamento::setConta);
        categoriaRepository.findById(lancamentosRequest.getCategoriaId()).ifPresent(lancamento::setCategoria);

        // Salvar a entidade no banco e retornar como resposta
        final var lancamentoSalvo = financLancamentosRepository.save(lancamento);
        return lancamentosMapper.toResponse(lancamentoSalvo);
    }

    public DemonstrativoResponse calcularDemonstrativo(int mes, int ano) {
        System.out.println("Iniciando cálculo do demonstrativo para mês: " + mes + " e ano: " + ano);

        List<LancamentosEntity> lancamentos = financLancamentosRepository.findAll();
        System.out.println("Total de lançamentos encontrados: " + lancamentos.size());

        YearMonth mesAtual = YearMonth.of(ano, mes);
        YearMonth mesAnterior = mesAtual.minusMonths(1);

        BigDecimal totalEntradaAtual = BigDecimal.ZERO;
        BigDecimal totalSaidaAtual = BigDecimal.ZERO;
        BigDecimal entradasMesAnterior = BigDecimal.ZERO;
        BigDecimal saidasMesAnterior = BigDecimal.ZERO;

        // Somente categorias e valores do mês atual
        Map<String, BigDecimal> entradasPorCategoria = new HashMap<>();
        Map<String, BigDecimal> saidasPorCategoria = new HashMap<>();

        // Cores das categorias
        Map<String, String> categoriaCores = new HashMap<>();

        // Acumular saldo total com todos os lançamentos
        BigDecimal saldoTotal = BigDecimal.ZERO;

        for (LancamentosEntity lancamento : lancamentos) {
            BigDecimal valor = lancamento.getValor();
            String categoria = lancamento.getCategoria() != null ? lancamento.getCategoria().getDescricao() : null;
            String cor = lancamento.getCategoria() != null ? lancamento.getCategoria().getCor() : null;

            if (categoria == null) {
                System.out.println("Categoria nula encontrada para o lançamento: " + lancamento);
            } else {
                categoriaCores.putIfAbsent(categoria, cor);
            }

            YearMonth mesLancamento = YearMonth.from(lancamento.getData());
            System.out.println("Processando lançamento: " + lancamento + ", mês do lançamento: " + mesLancamento);

            if (lancamento.getTipo() == 1) { // Tipo 1 para Entrada
                saldoTotal = saldoTotal.add(valor); // Adiciona ao saldo total de entradas

                if (mesLancamento.equals(mesAtual)) {
                    // Atualiza o total do mês atual
                    totalEntradaAtual = totalEntradaAtual.add(valor);
                    entradasPorCategoria.merge(categoria, valor, BigDecimal::add);
                } else if (mesLancamento.equals(mesAnterior)) {
                    // Total do mês anterior
                    entradasMesAnterior = entradasMesAnterior.add(valor);
                }
            } else if (lancamento.getTipo() == 2) { // Tipo 2 para Saída
                saldoTotal = saldoTotal.subtract(valor); // Subtrai do saldo total de saídas

                if (mesLancamento.equals(mesAtual)) {
                    // Atualiza o total do mês atual
                    totalSaidaAtual = totalSaidaAtual.add(valor);
                    saidasPorCategoria.merge(categoria, valor, BigDecimal::add);
                } else if (mesLancamento.equals(mesAnterior)) {
                    // Total do mês anterior
                    saidasMesAnterior = saidasMesAnterior.add(valor);
                }
            }
        }

        System.out.println("Entradas por categoria (mês atual): " + entradasPorCategoria);
        System.out.println("Saídas por categoria (mês atual): " + saidasPorCategoria);

        List<DemonstrativoLancamentoResponse> entradas = entradasPorCategoria.entrySet().stream()
                .map(entry -> new DemonstrativoLancamentoResponse(entry.getKey(), entry.getValue(), categoriaCores.get(entry.getKey())))
                .collect(Collectors.toList());

        List<DemonstrativoLancamentoResponse> saidas = saidasPorCategoria.entrySet().stream()
                .map(entry -> new DemonstrativoLancamentoResponse(entry.getKey(), entry.getValue(), categoriaCores.get(entry.getKey())))
                .collect(Collectors.toList());

        BigDecimal percentualEntrada = calcularPercentualVariacao(entradasMesAnterior, totalEntradaAtual);
        BigDecimal percentualSaida = calcularPercentualVariacao(saidasMesAnterior, totalSaidaAtual);

        System.out.println("Total de entrada atual: " + totalEntradaAtual);
        System.out.println("Total de saída atual: " + totalSaidaAtual);
        System.out.println("Saldo total: " + saldoTotal);
        System.out.println("Percentual de entrada: " + percentualEntrada);
        System.out.println("Percentual de saída: " + percentualSaida);

        DemonstrativoResponse response = new DemonstrativoResponse();
        response.setEntradas(entradas);
        response.setSaidas(saidas);
        response.setSaldoTotal(saldoTotal); // Saldo total acumulado
        response.setTotalEntradaAtual(totalEntradaAtual);
        response.setTotalSaidaAtual(totalSaidaAtual);
        response.setEntradasMesAnterior(entradasMesAnterior);
        response.setSaidasMesAnterior(saidasMesAnterior);
        response.setPercentualEntrada(percentualEntrada);
        response.setPercentualSaida(percentualSaida);

        System.out.println("Response final: " + response);
        return response;
    }


    public void deletarLancamentoPorId(Long id) {
        financLancamentosRepository.deleteById(id);
    }

    public List<LancamentosResponse> buscarLancamentosPorFiltroPaginado(FiltroRequest filtroRequest) {
        System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 01");
        // Verifica se dataInicio e dataFim são nulos
        if (filtroRequest.getDataInicio() == null && filtroRequest.getDataFim() == null) {
            System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 02");
            // Define a data de início como o primeiro dia do mês atual
            LocalDate hoje = LocalDate.now();
            LocalDate primeiroDiaDoMes = hoje.withDayOfMonth(1);

            System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 03");

            // Atualiza o objeto de requisição
            filtroRequest.setDataInicio(primeiroDiaDoMes);
            filtroRequest.setDataFim(hoje);

            System.out.println("DEBUG buscarLancamentosPorFiltroPaginado 04");
        }
        System.out.println("DEBUG FinanceiroService lancamentosRequest: " + filtroRequest);
        List<LancamentosEntity> lancamentosEntities = financLancamentosRepository.findLancamentosByFilter(filtroRequest);
        System.out.println("DEBUG buscarLancamentosPorFiltroPaginado lancamentosEntities: ");
        lancamentosEntities.forEach(System.out::println);
        return lancamentosMapper.toResponseList(lancamentosEntities);
    }

    // Método auxiliar para calcular a variação percentual
    private BigDecimal calcularPercentualVariacao(BigDecimal valorAnterior, BigDecimal valorAtual) {
        if (valorAnterior.compareTo(BigDecimal.ZERO) == 0) return BigDecimal.ZERO;
        return valorAtual.subtract(valorAnterior)
                .divide(valorAnterior, 2, RoundingMode.HALF_UP)
                .multiply(BigDecimal.valueOf(100));
    }

    public List<CategoriaEntity> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public List<ContaEntity> getAllContas() {
        return contaRepository.findAll();
    }
}
