package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.DependentesService;
import org.springframework.stereotype.Service;

@Service
public class DependentesServiceImp implements DependentesService {

    @Override
    public PropostaCreditoWrapper validaDependentes(PropostaCreditoWrapper propostaCredito) {
        if(propostaCredito.getDependentes() == 0) {
            propostaCredito
                    .setScore(propostaCredito.getScore() /
                            (propostaCredito.getDependentes() + 2));
        } else {
            propostaCredito
                    .setScore(propostaCredito.getScore() /
                            (propostaCredito.getDependentes() + 1));
        }
        return propostaCredito;
    }
}
