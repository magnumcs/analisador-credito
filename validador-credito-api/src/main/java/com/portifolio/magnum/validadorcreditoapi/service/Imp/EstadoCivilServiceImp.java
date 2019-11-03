package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.domain.EstadoCivilEnum;
import com.portifolio.magnum.validadorcreditoapi.service.EstadoCivilService;
import org.springframework.stereotype.Service;

@Service
public class EstadoCivilServiceImp implements EstadoCivilService {

    @Override
    public PropostaCredito validaEstadoCivil(PropostaCredito propostaCredito) {
        if(EstadoCivilEnum.SOLTEIRO.equals(propostaCredito.getEstadoCivil()) ||
                EstadoCivilEnum.VIUVO.equals(propostaCredito.getEstadoCivil())) {
            propostaCredito
                    .setScore(propostaCredito.getScore() - 300);
        } else if(EstadoCivilEnum.DIVORCIADO.equals(propostaCredito.getEstadoCivil())) {
            propostaCredito
                    .setScore(propostaCredito.getScore() - 500);
        }
        return propostaCredito;
    }
}
