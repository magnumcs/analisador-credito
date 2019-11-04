package com.portifolio.magnum.validadorcreditoapi.controller;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.exception.CreditoReprovadoException;
import com.portifolio.magnum.validadorcreditoapi.service.PropostaCreditoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(value = "/api/analise")
public class AnalisePropostaCreditoController {

    private final PropostaCreditoService propostaCreditoService;

    @Autowired
    public AnalisePropostaCreditoController(PropostaCreditoService propostaCreditoService) {
        this.propostaCreditoService = propostaCreditoService;
    }

    @ApiOperation(value = "Retorna o resultado da análise de crédito")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna um json com as informações, a resposta da análise e os detalhes da mesma."),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping(value = "/proposta")
    public ResponseEntity<PropostaCreditoWrapper> analiseProposta(@RequestBody PropostaCreditoWrapper propostaCredito) {

        PropostaCreditoWrapper response = propostaCreditoService.analisarEtapasCredito(propostaCredito);
        return ResponseEntity.ok().body(response);

    }

    @ApiIgnore
    @ExceptionHandler(CreditoReprovadoException.class)
    protected ResponseEntity<Object> tratamentoExcessaoCreditoProposto(CreditoReprovadoException exception) {
        return ResponseEntity.ok(exception.getPropostaCreditoWrapper());
    }

}
