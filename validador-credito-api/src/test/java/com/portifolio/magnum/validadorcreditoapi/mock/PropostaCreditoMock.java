package com.portifolio.magnum.validadorcreditoapi.mock;

import com.portifolio.magnum.validadorcreditoapi.domain.*;
import com.portifolio.magnum.validadorcreditoapi.domain.wrapper.PropostaCreditoWrapper;

public class PropostaCreditoMock {

    public static PropostaCreditoWrapper propostaCreditoRendaBaixa() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Marcos");
        propostaCredito.setIdade(19);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(400.0);

        return propostaCredito;

    }

    public static PropostaCreditoWrapper propostaCreditoRendaBaixaResposta() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Marcos");
        propostaCredito.setIdade(19);
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

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA1000() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(17);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(1000.0);

        return propostaCredito;

    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA2500() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(17);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;

    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgual2500Maior18AnosSolteiro() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Lucas");
        propostaCredito.setIdade(28);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;

    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA2500Divorcidado() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(17);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;

    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA1000IdadeSuperior70Anos() {

        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Ana");
        propostaCredito.setIdade(70);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(1000.0);

        return propostaCredito;

    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA8000IdadeSuperior18AnosCasado3Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Pedro");
        propostaCredito.setIdade(68);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(3);
        propostaCredito.setRenda(8000.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA5000IdadeSuperior18AnosCasado3Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Paula");
        propostaCredito.setIdade(61);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.RJ);
        propostaCredito.setDependentes(3);
        propostaCredito.setRenda(5000.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA2000IdadeSuperior18AnosDivorciado2Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("João");
        propostaCredito.setIdade(56);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
        propostaCredito.setEstado(EstadoEnum.RJ);
        propostaCredito.setDependentes(2);
        propostaCredito.setRenda(2000.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA2000IdadeSuperior18AnosDivorciado1Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Maria");
        propostaCredito.setIdade(45);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(1);
        propostaCredito.setRenda(2000.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA8000IdadeSuperior18AnosCasado2Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("José");
        propostaCredito.setIdade(30);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.MA);
        propostaCredito.setDependentes(2);
        propostaCredito.setRenda(8000.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA1500IdadeSuperior18AnosViuva3Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Suzan");
        propostaCredito.setIdade(63);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.VIUVO);
        propostaCredito.setEstado(EstadoEnum.MA);
        propostaCredito.setDependentes(3);
        propostaCredito.setRenda(1500.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgualA2500IdadeSuperior18AnosSolteiro2Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Luci");
        propostaCredito.setIdade(28);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(2);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgual500Idade16AnosSolteiro() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Roberto");
        propostaCredito.setIdade(16);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(500.0);

        return propostaCredito;
    }

    public static PropostaCreditoWrapper propostaCreditoRendaIgual8000IdadeSuperior18AnosCasado5Dependentes() {
        PropostaCreditoWrapper propostaCredito = new PropostaCreditoWrapper();
        propostaCredito.setNome("Bruno");
        propostaCredito.setIdade(30);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.MA);
        propostaCredito.setDependentes(5);
        propostaCredito.setRenda(8000.0);

        return propostaCredito;
    }

}
