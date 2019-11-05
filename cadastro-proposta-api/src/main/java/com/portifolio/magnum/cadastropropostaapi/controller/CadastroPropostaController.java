package com.portifolio.magnum.cadastropropostaapi.controller;

import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoRespostaWrapper;
import com.portifolio.magnum.cadastropropostaapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.cadastropropostaapi.service.PropostaCreditoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/propostas")
public class CadastroPropostaController {

    private final PropostaCreditoService propostaCreditoService;

    @Autowired
    public CadastroPropostaController(PropostaCreditoService propostaCreditoService) {
        this.propostaCreditoService = propostaCreditoService;
    }

    @ApiOperation(value = "Cadastra uma nova proposta de crédito")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna um json com as informações da proposta cadastrada."),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping(value = "/nova")
    ResponseEntity<PropostaCreditoWrapper> novaProposta(@RequestBody PropostaCreditoWrapper propostaCreditoWrapper) {
        PropostaCreditoWrapper response = propostaCreditoService.analisarPropostaCredito(propostaCreditoWrapper);
        return ResponseEntity.ok().body(response);
    }

    @ApiOperation(value = "Retorna todas as propostas cadastradas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma lista com todas as propostas cadastradas no sistema."),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/")
    ResponseEntity<List<PropostaCreditoWrapper>> propostas() {
        List<PropostaCreditoWrapper> propostas = propostaCreditoService.listarTodasPropostas();
        return ResponseEntity.ok().body(propostas);
    }

    @ApiOperation(value = "Busca uma proposta no sistema")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Realiza a busca de uma proposta passando o número do CPF."),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/{cpf}")
    ResponseEntity<PropostaCreditoWrapper> getPropostaByCpf(@PathVariable String cpf) {
        PropostaCreditoWrapper propostaCredito = propostaCreditoService.buscarPropostaCreditoPorCPF(cpf);
        return ResponseEntity.ok().body(propostaCredito);
    }

}
