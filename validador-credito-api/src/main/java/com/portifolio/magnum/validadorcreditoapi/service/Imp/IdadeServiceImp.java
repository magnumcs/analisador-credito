package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.IdadeService;
import org.springframework.stereotype.Service;

@Service
public class IdadeServiceImp implements IdadeService {

    @Override
    public PropostaCreditoWrapper validaIdade(PropostaCreditoWrapper propostaCredito) {
        if(propostaCredito.getIdade() < 18 || propostaCredito.getIdade() >= 70) {
            propostaCredito.setScore(propostaCredito.getScore() - 100);
        }
        return propostaCredito;
    }
}
