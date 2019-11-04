package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.EstadoCivilServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class EstadoCivilServiceTest {

    @InjectMocks
    EstadoCivilServiceImp estadoCivilService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoOEstadoCivilEhSolteiroDeveDescontar300PontosDoScore() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA2500();

        propostaCredito.setScore(propostaCredito.getRenda());

        PropostaCreditoWrapper propostaCredito1Resposta = estadoCivilService.validaEstadoCivil(propostaCredito);

        assertEquals(2200.0, propostaCredito1Resposta.getScore(), 0.0);
    }

    @Test
    public void quandoOEstadoCivilEhDivorciadoDeveDescontar300PontosDoScore() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA2500Divorcidado();

        propostaCredito.setScore(propostaCredito.getRenda());

        PropostaCreditoWrapper propostaCredito1Resposta = estadoCivilService.validaEstadoCivil(propostaCredito);

        assertEquals(1500.0, propostaCredito1Resposta.getScore(), 0.0);
    }

}
