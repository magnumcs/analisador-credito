package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.repository.PropostaCreditoRepository;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.EstadoCivilServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class EstadoCivilServiceTest {

    @InjectMocks
    EstadoCivilServiceImp estadoCivilService;

    @Mock
    PropostaCreditoRepository propostaCreditoRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoOEstadoCivilEhSolteiroDeveDescontar300PontosDoScore() {
        PropostaCredito propostaCredito = propostaCreditoRendaIgualA2500();

        when(propostaCreditoRepository.save(propostaCredito)).thenReturn(propostaCredito);

        PropostaCredito propostaCredito1Resposta = estadoCivilService.validaEstadoCivil(propostaCredito);

        assertEquals(2200.0, propostaCredito1Resposta.getScore(), 0.0);
    }

    @Test
    public void quandoOEstadoCivilEhDivorciadoDeveDescontar300PontosDoScore() {
        PropostaCredito propostaCredito = propostaCreditoRendaIgualA2500Divorcidado();

        when(propostaCreditoRepository.save(propostaCredito)).thenReturn(propostaCredito);

        PropostaCredito propostaCredito1Resposta = estadoCivilService.validaEstadoCivil(propostaCredito);

        assertEquals(2000.0, propostaCredito1Resposta.getScore(), 0.0);
    }

}
