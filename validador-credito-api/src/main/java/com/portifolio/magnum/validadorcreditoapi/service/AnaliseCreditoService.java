package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;

public interface AnaliseCreditoService {

    PropostaCreditoWrapper revisarPropostaCredito(PropostaCreditoWrapper propostaCredito);

}
