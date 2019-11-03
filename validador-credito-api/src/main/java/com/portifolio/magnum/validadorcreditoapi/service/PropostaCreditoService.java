package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;

public interface PropostaCreditoService {

    PropostaCredito buildPropostaCredito(PropostaCreditoWrapper propostaCreditoWrapper);

    PropostaCredito analisarEtapasCredito(PropostaCredito propostaCredito);

}
