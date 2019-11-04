package com.portifolio.magnum.validadorcreditoapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.portifolio.magnum.validadorcreditoapi.domain.DetalheRespostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.RespostaPropostaEnum;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static com.portifolio.magnum.validadorcreditoapi.mock.PropostaCreditoMock.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
@EnableAutoConfiguration
public class AnalisePropostaCreditoControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void quandoAPropostaDeCreditoTemRendaMenorQue1000DeveLancarExcessaoRendaBaixa() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper = propostaCreditoRendaBaixa();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.REPROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.RENDA_BAIXA.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA1000Menor18AnosESolteiro() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper = propostaCreditoRendaIgualA1000();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.ENTRE_100_500.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA2500Maior18AnosESolteiro() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper = propostaCreditoRendaIgual2500Maior18AnosSolteiro();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.ENTRE_500_1000.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA8000Maior18AnosCasado3Dependentes() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgualA8000IdadeSuperior18AnosCasado3Dependentes();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.ENTRE_1500_2000.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA5000Maior18AnosCasado3Dependentes() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgualA5000IdadeSuperior18AnosCasado3Dependentes();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.ENTRE_1000_1500.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA8000Maior18AnosCasado2Dependentes() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgualA8000IdadeSuperior18AnosCasado2Dependentes();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.SUPERIOR_2000.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA1500Maior18AnosViuvo3Dependentes() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgualA1500IdadeSuperior18AnosViuva3Dependentes();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.REPROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.REPROVADO_POLITIVA_CREDITO.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA2500Maior18AnosSolteiro2Dependentes() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgualA2500IdadeSuperior18AnosSolteiro2Dependentes();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.ENTRE_100_500.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA500Idade16AnosSolteiro() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgual500Idade16AnosSolteiro();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.REPROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.RENDA_BAIXA.getValor()));
    }

    @Test
    public void quandoAPropostaDeCreditoTemRendaIgualA8000IdadeSuperior18AnosCasado5Dependentes() throws Exception {
        PropostaCreditoWrapper propostaCreditoWrapper =
                propostaCreditoRendaIgual8000IdadeSuperior18AnosCasado5Dependentes();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/analise/proposta")
                .content(asJsonString(propostaCreditoWrapper))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.respostaProposta").value(RespostaPropostaEnum.APROVADO.getValor()))
                .andExpect(jsonPath("$.detalheResposta").value(DetalheRespostaEnum.ENTRE_1000_1500.getValor()));
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
