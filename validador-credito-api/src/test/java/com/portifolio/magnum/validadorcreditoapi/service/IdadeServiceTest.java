package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.repository.PropostaCreditoRepository;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.IdadeServiceImp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class IdadeServiceTest {

    @InjectMocks
    IdadeServiceImp idadeServiceImp;

    @Mock
    PropostaCreditoRepository propostaCreditoRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoAIdadeEhInferiorA18AnosDeveDescontar500PontosDoScore() {
        PropostaCredito propostaCredito = propostaCreditoRendaIgualA1000();

        when(propostaCreditoRepository.save(propostaCredito)).thenReturn(propostaCredito);

        PropostaCredito propostaCredito1Resposta = idadeServiceImp.validaIdade(propostaCredito);

        assertEquals(500.0, propostaCredito1Resposta.getScore(), 0.0);
    }

    @Test
    public void quandoAIdadeEhSuperiorA70AnosDeveDescontar500PontosDoScore() {
        PropostaCredito propostaCredito = propostaCreditoRendaIgualA1000IdadeSuperior70Anos();

        when(propostaCreditoRepository.save(propostaCredito)).thenReturn(propostaCredito);

        PropostaCredito propostaCredito1Resposta = idadeServiceImp.validaIdade(propostaCredito);

        assertEquals(500.0, propostaCredito1Resposta.getScore(), 0.0);
    }



}
