package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaCreditoServiceImp implements PropostaCreditoService {

    private final RendaService rendaService;
    private final DependentesService dependentesService;
    private final EstadoCivilService estadoCivilService;
    private final IdadeService idadeService;
    private final AnaliseCreditoService analiseCreditoService;

    @Autowired
    public PropostaCreditoServiceImp(RendaService rendaService, DependentesService dependentesService,
                                     EstadoCivilService estadoCivilService, IdadeService idadeService,
                                     AnaliseCreditoService analiseCreditoService) {
        this.rendaService = rendaService;
        this.dependentesService = dependentesService;
        this.estadoCivilService = estadoCivilService;
        this.idadeService = idadeService;
        this.analiseCreditoService = analiseCreditoService;
    }

    @Override
    public PropostaCreditoWrapper analisarEtapasCredito(PropostaCreditoWrapper propostaCredito) {
        PropostaCreditoWrapper propostaCreditoResposta;
        propostaCredito.setScore(propostaCredito.getRenda());
        rendaService.validaRenda(propostaCredito);
        propostaCreditoResposta = dependentesService.validaDependentes(propostaCredito);
        propostaCreditoResposta = estadoCivilService.validaEstadoCivil(propostaCreditoResposta);
        propostaCreditoResposta = idadeService.validaIdade(propostaCreditoResposta);
        propostaCreditoResposta = analiseCreditoService.revisarPropostaCredito(propostaCreditoResposta);

        return  propostaCreditoResposta;
    }
}
