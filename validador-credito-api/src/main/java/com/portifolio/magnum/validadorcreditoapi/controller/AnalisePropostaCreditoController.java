package com.portifolio.magnum.validadorcreditoapi.controller;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.exception.CreditoReprovadoException;
import com.portifolio.magnum.validadorcreditoapi.service.PropostaCreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/analise")
public class AnalisePropostaCreditoController {

    private final PropostaCreditoService propostaCreditoService;

    @Autowired
    public AnalisePropostaCreditoController(PropostaCreditoService propostaCreditoService) {
        this.propostaCreditoService = propostaCreditoService;
    }

    @PostMapping(value = "/proposta")
    public ResponseEntity<PropostaCreditoWrapper> analiseProposta(@RequestBody PropostaCreditoWrapper propostaCredito) {

        PropostaCredito response = propostaCreditoService.buildPropostaCredito(propostaCredito);
        return ResponseEntity.ok().body(new PropostaCreditoWrapper(response));

    }

    @ExceptionHandler(CreditoReprovadoException.class)
    protected ResponseEntity<Object> tratamentoExcessaoCreditoProposto(CreditoReprovadoException exception) {
        return ResponseEntity.ok(exception.getPropostaCreditoWrapper());
    }

}
