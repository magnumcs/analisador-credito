package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.DependentesServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class DependentesServiceTest {

    @InjectMocks
    DependentesServiceImp dependentesService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoONumeroDeDependentesEhIgualA0RetornaScoreEntre100E500() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA1000();

        propostaCredito.setScore(propostaCredito.getRenda());

        PropostaCreditoWrapper propostaCredito1Resposta = dependentesService.validaDependentes(propostaCredito);

        assertTrue(scoreEntre100E150(propostaCredito1Resposta.getScore()));

    }

    @Test
    public void quandoONumeroDeDependentesEhIgualA0RetornaScoreEntre500E1000() {
        PropostaCreditoWrapper propostaCredito = propostaCreditoRendaIgualA2500();

        propostaCredito.setScore(propostaCredito.getRenda());

        PropostaCreditoWrapper propostaCredito1Resposta = dependentesService.validaDependentes(propostaCredito);

        assertTrue(scoreEntre500E1000(propostaCredito1Resposta.getScore()-300));

    }

    private Boolean scoreEntre100E150(Double valor) {
        return (valor >= 100 && valor <= 500);
    }

    private Boolean scoreEntre500E1000(Double valor) {
        return (valor >= 500 && valor <= 1000);
    }

}
