package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.domain.DetalheRespostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.RespostaPropostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.propostaCreditoRendaBaixaResposta;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.Silent.class)
public class AnaliseCreditoServiceTest {

    @InjectMocks
    AnaliseCreditoServiceImp analiseCreditoService;
    @Mock
    RendaServiceImp rendaService;
    @Mock
    DependentesServiceImp dependentesService;
    @Mock
    EstadoCivilService estadoCivilService;
    @Mock
    IdadeServiceImp idadeService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoARendaEMenorQue1000EntaoRetornaRespostaEDetalhesRendaBaixa() {
        PropostaCreditoWrapper propostaCreditoRetorno = analiseCreditoService.revisarPropostaCredito(propostaCreditoRendaBaixaResposta());

        assertEquals(RespostaPropostaEnum.APROVADO.getValor(),
                propostaCreditoRetorno.getRespostaProposta());
        assertEquals(DetalheRespostaEnum.ENTRE_100_500.getValor(),
                propostaCreditoRetorno.getDetalheResposta());

    }

}
