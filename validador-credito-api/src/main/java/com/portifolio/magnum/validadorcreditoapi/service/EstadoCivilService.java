package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;

public interface EstadoCivilService {

    PropostaCreditoWrapper validaEstadoCivil(PropostaCreditoWrapper propostaCredito);

}
