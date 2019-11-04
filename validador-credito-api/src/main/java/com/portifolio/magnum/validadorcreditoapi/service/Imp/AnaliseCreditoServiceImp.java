package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.domain.DetalheRespostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.RespostaPropostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.AnaliseCreditoService;
import org.springframework.stereotype.Service;

@Service
public class AnaliseCreditoServiceImp implements AnaliseCreditoService {

    @Override
    public PropostaCreditoWrapper revisarPropostaCredito(PropostaCreditoWrapper propostaCredito) {

        if (propostaCredito.getScore() >= 100 && propostaCredito.getScore() <= 500){
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.APROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.ENTRE_100_500.getValor());
            return propostaCredito;
        } else if (propostaCredito.getScore() >= 500 && propostaCredito.getScore() <= 1000){
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.APROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.ENTRE_500_1000.getValor());
            return propostaCredito;
        } else if (propostaCredito.getScore() >= 1000 && propostaCredito.getScore() <= 1500){
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.APROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.ENTRE_1000_1500.getValor());
            return propostaCredito;
        } else if (propostaCredito.getScore() >= 1500 && propostaCredito.getScore() <= 2000){
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.APROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.ENTRE_1500_2000.getValor());
            return propostaCredito;
        } else if (propostaCredito.getScore() > 2000){
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.APROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.SUPERIOR_2000.getValor());
            return propostaCredito;
        } else {
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.REPROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.REPROVADO_POLITIVA_CREDITO.getValor());
            return propostaCredito;
        }
    }

}
