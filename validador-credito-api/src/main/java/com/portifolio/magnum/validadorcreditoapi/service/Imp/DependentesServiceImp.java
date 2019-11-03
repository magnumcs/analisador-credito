package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.service.DependentesService;
import org.springframework.stereotype.Service;

@Service
public class DependentesServiceImp implements DependentesService {

    @Override
    public PropostaCredito validaDependentes(PropostaCredito propostaCredito) {
        propostaCredito
                .setScore(propostaCredito.getScore() /
                                (propostaCredito.getDependentes() + 2));
        return propostaCredito;
    }
}
