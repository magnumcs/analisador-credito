package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.EstadoCivilService;
import org.springframework.stereotype.Service;

@Service
public class EstadoCivilServiceImp implements EstadoCivilService {

    @Override
    public PropostaCreditoWrapper validaEstadoCivil(PropostaCreditoWrapper propostaCredito) {
        if(EstadoCivilEnum.SOLTEIRO.equals(propostaCredito.getEstadoCivil()) ||
                EstadoCivilEnum.VIUVO.equals(propostaCredito.getEstadoCivil())) {
            if(propostaCredito.getDependentes() > 1) {
                propostaCredito
                        .setScore(propostaCredito.getScore() - 400);
            } else {
                propostaCredito
                        .setScore(propostaCredito.getScore() - 300);
            }
        } else if(EstadoCivilEnum.DIVORCIADO.equals(propostaCredito.getEstadoCivil())) {
            propostaCredito
                    .setScore(propostaCredito.getScore() - 1000);
        }
        return propostaCredito;
    }
}
