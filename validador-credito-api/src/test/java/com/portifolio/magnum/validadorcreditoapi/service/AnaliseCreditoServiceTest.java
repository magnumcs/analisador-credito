package com.portifolio.magnum.validadorcreditoapi.service;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.domain.DetalheRespostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.RespostaPropostaEnum;
import com.portifolio.magnum.validadorcreditoapi.repository.PropostaCreditoRepository;
import com.portifolio.magnum.validadorcreditoapi.service.Imp.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.propostaCreditoRendaBaixa;
import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.propostaCreditoRendaBaixaResposta;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

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

    @Mock
    PropostaCreditoRepository propostaCreditoRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void quandoARendaEMenorQue1000EntaoRetornaRespostaEDetalhesRendaBaixa() {
        PropostaCredito propostaCreditoRetorno = analiseCreditoService.revisarPropostaCredito(propostaCreditoRendaBaixaResposta());

        assertEquals(RespostaPropostaEnum.REPROVADO.getValor(),
                propostaCreditoRetorno.getRespostaProposta());
        assertEquals(DetalheRespostaEnum.RENDA_BAIXA.getValor(),
                propostaCreditoRetorno.getDetalheResposta());

    }

}
