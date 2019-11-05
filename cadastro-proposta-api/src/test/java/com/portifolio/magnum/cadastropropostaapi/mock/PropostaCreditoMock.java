package com.portifolio.magnum.cadastropropostaapi.mock;

import com.portifolio.magnum.cadastropropostaapi.Model.PropostaCredito;
import com.portifolio.magnum.cadastropropostaapi.domain.*;

public class PropostaCreditoMock {

    public static PropostaCredito propostaCreditoRendaBaixa() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Marcos");
        propostaCredito.setIdade(19);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(400.0);

        return propostaCredito;

    }

    public static PropostaCredito propostaCreditoRendaBaixaResposta() {

        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Marcos");
        propostaCredito.setCpf("207.025.890-47");
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

    public static PropostaCredito propostaCreditoRendaIgualA5000IdadeSuperior18AnosCasado3Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Paula");
        propostaCredito.setIdade(61);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.RJ);
        propostaCredito.setDependentes(3);
        propostaCredito.setRenda(5000.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgualA2000IdadeSuperior18AnosDivorciado2Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("João");
        propostaCredito.setIdade(56);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
        propostaCredito.setEstado(EstadoEnum.RJ);
        propostaCredito.setDependentes(2);
        propostaCredito.setRenda(2000.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgualA2000IdadeSuperior18AnosDivorciado1Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Maria");
        propostaCredito.setIdade(45);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.DIVORCIADO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(1);
        propostaCredito.setRenda(2000.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgualA8000IdadeSuperior18AnosCasado2Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("José");
        propostaCredito.setIdade(30);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.CASADO);
        propostaCredito.setEstado(EstadoEnum.MA);
        propostaCredito.setDependentes(2);
        propostaCredito.setRenda(8000.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgualA1500IdadeSuperior18AnosViuva3Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Suzan");
        propostaCredito.setIdade(63);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.VIUVO);
        propostaCredito.setEstado(EstadoEnum.MA);
        propostaCredito.setDependentes(3);
        propostaCredito.setRenda(1500.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgualA2500IdadeSuperior18AnosSolteiro2Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Luci");
        propostaCredito.setIdade(28);
        propostaCredito.setGenero(GeneroEnum.Feminino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SC);
        propostaCredito.setDependentes(2);
        propostaCredito.setRenda(2500.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgual500Idade16AnosSolteiro() {
        PropostaCredito propostaCredito = new PropostaCredito();
        propostaCredito.setNome("Roberto");
        propostaCredito.setIdade(16);
        propostaCredito.setGenero(GeneroEnum.Masculino);
        propostaCredito.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        propostaCredito.setEstado(EstadoEnum.SP);
        propostaCredito.setDependentes(0);
        propostaCredito.setRenda(500.0);

        return propostaCredito;
    }

    public static PropostaCredito propostaCreditoRendaIgual8000IdadeSuperior18AnosCasado5Dependentes() {
        PropostaCredito propostaCredito = new PropostaCredito();
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
