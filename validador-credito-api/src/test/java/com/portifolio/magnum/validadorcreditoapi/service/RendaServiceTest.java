package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.exception.CreditoReprovadoException;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.RendaServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class RendaServiceTest {

    @InjectMocks
    RendaServiceImp rendaService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = CreditoReprovadoException.class)
    public void quandoARendaEMenorQue1000EntaoRetornaRendaBaixa() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaBaixa();

        rendaService.validaRenda(propostaCredito);

    }

    @Test
    public void quandoARendaEMaiorQue1000EntaoNaoRetornaRendaBaixa() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA1000();

        rendaService.validaRenda(propostaCredito);

    }

}
