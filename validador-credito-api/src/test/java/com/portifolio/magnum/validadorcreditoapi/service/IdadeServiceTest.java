package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.IdadeServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class IdadeServiceTest {

    @InjectMocks
    IdadeServiceImp idadeServiceImp;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoAIdadeEhInferiorA18AnosDeveDescontar500PontosDoScore() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA1000();

        propostaCredito.setScore(propostaCredito.getRenda());

        PropostaCreditoWrapper propostaCredito1Resposta = idadeServiceImp.validaIdade(propostaCredito);

        assertEquals(900, propostaCredito1Resposta.getScore(), 0.0);
    }

    @Test
    public void quandoAIdadeEhSuperiorA70AnosDeveDescontar500PontosDoScore() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA1000IdadeSuperior70Anos();

        propostaCredito.setScore(propostaCredito.getRenda());

        PropostaCreditoWrapper propostaCredito1Resposta = idadeServiceImp.validaIdade(propostaCredito);

        assertEquals(900, propostaCredito1Resposta.getScore(), 0.0);
    }



}
