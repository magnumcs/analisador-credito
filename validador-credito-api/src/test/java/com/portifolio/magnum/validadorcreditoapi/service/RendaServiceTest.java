package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.domain.RespostaPropostaEnum;
import com.portifolio.magnum.validadorcreditoapi.exception.CreditoReprovadoException;
import com.portifolio.magnum.validadorcreditoapi.repository.PropostaCreditoRepository;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.RendaServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class RendaServiceTest {

    @InjectMocks
    RendaServiceImp rendaService;

    @Mock
    PropostaCreditoRepository propostaCreditoRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = CreditoReprovadoException.class)
    public void quandoARendaEMenorQue1000EntaoRetornaRendaBaixa() {
        PropostaCredito propostaCredito = propostaCreditoRendaBaixa();

        when(propostaCreditoRepository.save(propostaCredito)).thenReturn(propostaCredito);

        rendaService.validaRenda(propostaCredito);

    }

    @Test
    public void quandoARendaEMaiorQue1000EntaoNaoRetornaRendaBaixa() {
        PropostaCredito propostaCredito = propostaCreditoRendaIgualA1000();

        when(propostaCreditoRepository.save(propostaCredito)).thenReturn(propostaCredito);

        rendaService.validaRenda(propostaCredito);

    }

}
