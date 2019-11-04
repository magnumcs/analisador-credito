package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;

public interface DependentesService {

    PropostaCreditoWrapper validaDependentes(PropostaCreditoWrapper propostaCredito);

}
