package com.portifolio.magnum.validadorcreditoapi.service.Imp;

import com.portifolio.magnum.validadorcreditoapi.domain.DetalheRespostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.RespostaPropostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.exception.CreditoReprovadoException;
import com.portifolio.magnum.validadorcreditoapi.service.RendaService;
import org.springframework.stereotype.Service;

@Service
public class RendaServiceImp implements RendaService {

    @Override
    public void validaRenda(PropostaCreditoWrapper propostaCredito) {
        if(propostaCredito.getRenda() < 1000) {
            propostaCredito.setRespostaProposta(RespostaPropostaEnum.REPROVADO.getValor());
            propostaCredito.setDetalheResposta(DetalheRespostaEnum.RENDA_BAIXA.getValor());

            throw new CreditoReprovadoException(propostaCredito);
        }
    }
}
