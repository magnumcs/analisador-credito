package com.portifolio.magnum.validadorcreditoapi.mock;

import com.portifolio.magnum.validadorcreditoapi.Model.PropostaCredito;
import com.portifolio.magnum.validadorcreditoapi.domain.*;

public class PropostaCreditoMock {

    public static PropostaCredito propostaCreditoRendaBaixa() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Lucas");
        propostaCredito.setIdade(28);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(400.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaBaixaResposta() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Lucas");
        propostaCredito.setIdade(28);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(400.0);
        propostaCredito.setScore(400.0);
        propostaCredito.setRespostaProposta(RespostaPropostaEnum.REPROVADO.getValor());
        propostaCredito.setDetalheResposta(DetalheRespostaEnum.RENDA_BAIXA.getValor());

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaIgualA1000() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(17);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(1000.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaIgualA2500() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(17);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaIgual2500Maior18AnosSolteiro() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Lucas");
        propostaCredito.setIdade(28);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaIgualA2500Divorcidado() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(17);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaIgualA1000IdadeSuperior70Anos() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(70);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(1000.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaIgualA8000IdadeSuperior18AnosCasado3Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Pedro");
        propostaCredito.setIdade(68);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(3);
        propostaCredito.setRenda(8000.0);

        return propostaCredito;
    }

}
