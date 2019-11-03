package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
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
    public PropostaCredito buildPropostaCredito(PropostaCreditoWrapper propostaCreditoWrapper) {
        PropostaCredito propostaCredito = PropostaCredito.builder()
                .id(propostaCreditoWrapper.getId())
                .nome(propostaCreditoWrapper.getNome())
                .idade(propostaCreditoWrapper.getIdade())
                .genero(propostaCreditoWrapper.getGenero())
                .estadoCivil(propostaCreditoWrapper.getEstadoCivil())
                .estado(propostaCreditoWrapper.getEstado())
                .dependentes(propostaCreditoWrapper.getDependentes())
                .renda(propostaCreditoWrapper.getRenda())
                .respostaProposta(propostaCreditoWrapper.getRespostaProposta())
                .detalheResposta(propostaCreditoWrapper.getDetalheResposta())
                .score(propostaCreditoWrapper.getRenda())
                .build();
        return analisarEtapasCredito(propostaCredito);
    }

    @Override
    public PropostaCredito analisarEtapasCredito(PropostaCredito propostaCredito) {
        PropostaCredito propostaCreditoResposta;
        rendaService.validaRenda(propostaCredito);
        propostaCreditoResposta = dependentesService.validaDependentes(propostaCredito);
        propostaCreditoResposta = estadoCivilService.validaEstadoCivil(propostaCreditoResposta);
        propostaCreditoResposta = idadeService.validaIdade(propostaCreditoResposta);
        propostaCreditoResposta = analiseCreditoService.revisarPropostaCredito(propostaCreditoResposta);

        return  propostaCreditoResposta;
    }
}
